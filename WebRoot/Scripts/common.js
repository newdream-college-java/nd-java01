jQuery.fn.extend({
	selectbox: function(options) {
		return this.each(function() {
			new jQuery.SelectBox(this, options);
		});
	}
});


/* pawel maziarz: work around for ie logging */
if (!window.console) {
	var console = {
		log: function(msg) { 
	 }
	}
}
/* */

jQuery.SelectBox = function(selectobj, options) {
	
	var opt = options || {};
	opt.inputClass = opt.inputClass || "selectbox";
	opt.containerClass = opt.containerClass || "selectbox-wrapper";
	opt.hoverClass = opt.hoverClass || "current";
	opt.currentClass = opt.selectedClass || "selected"
	opt.onChangeCallback = opt.onChangeCallback || false;
	opt.onChangeParams = opt.onChangeParams || false;
	opt.debug = opt.debug || false;
	
	var elm_id = selectobj.id;
	var active = 0;
	var inFocus = false;
	var hasfocus = 0;
	//jquery object for select element
	var $select = $(selectobj);
	// jquery container object
	var $container = setupContainer(opt);
	//jquery input object 
	var $input = setupInput(opt);
	// hide select and append newly created elements
	$select.hide().wrapAll("<div class='yselector'><div class='yselector_box'></div></div>")
	.before("<div class='yselector_arraw'><b></b></div>")
	.before($input).before($container);	
	init();	
	$input
	.click(function(){
    if (!inFocus) {
		  $container.toggle();
		}
	})
	.focus(function(){
	   if ($container.not(':visible')) {
	       inFocus = true;
	       $container.show();
	   }
	})
	.keydown(function(event) {	   
		switch(event.keyCode) {
			case 38: // up
				event.preventDefault();
				moveSelect(-1);
				break;
			case 40: // down
				event.preventDefault();
				moveSelect(1);
				break;
			//case 9:  // tab 
			case 13: // return
				event.preventDefault(); // seems not working in mac !
				$('li.'+opt.hoverClass).trigger('click');
				break;
			case 27: //escape
			  hideMe();
			  break;
		}
	})
	.blur(function() {
		if ($container.is(':visible') && hasfocus > 0 ) {
			if(opt.debug) console.log('container visible and has focus')
		} else {
		  // Workaround for ie scroll - thanks to Bernd Matzner
		  if($.browser.msie || $.browser.safari){ // check for safari too - workaround for webkit
		hideMe();//修复select失去焦点不能收回的bug
        if(document.activeElement.getAttribute('id').indexOf('_container')==-1){
          hideMe();
        } else {
          $input.focus();
        }
      } else {
        hideMe();
      }
		}
	});


	function hideMe() { 
		hasfocus = 0;
		$container.hide(); 
	}
	
	function init() {
		$container.append(getSelectOptions($input.attr('id'))).hide();
		var width = $input.css('width');

    }
	
	function setupContainer(options) {
		var container = document.createElement("div");
		$container = $(container);
		$container.attr('id', elm_id+'_container');
		$container.addClass("yselector_suggest");
		
		return $container;
	}
	
	function setupInput(options) {
		var input = document.createElement("input");
		var $input = $(input);
		$input.attr("id", elm_id+"_input");
		$input.attr("type", "text");
		$input.addClass("yselector_input");
		$input.attr("autocomplete", "off");
		$input.attr("readonly", "readonly");
		$input.attr("tabIndex", $select.attr("tabindex")); // "I" capital is important for ie

		return $input;	
	}
	
	function moveSelect(step) {
		var lis = $("li", $container);
		if (!lis || lis.length == 0) return false;
		active += step;
    //loop through list
		if (active < 0) {
			active = lis.size();
		} else if (active > lis.size()) {
			active = 0;
		}
    scroll(lis, active);
		lis.removeClass(opt.hoverClass);

		$(lis[active]).addClass(opt.hoverClass);
	}
	
	function scroll(list, active) {
      var el = $(list[active]).get(0);
      var list = $container.get(0);
      
      if (el.offsetTop + el.offsetHeight > list.scrollTop + list.clientHeight) {
        list.scrollTop = el.offsetTop + el.offsetHeight - list.clientHeight;      
      } else if(el.offsetTop < list.scrollTop) {
        list.scrollTop = el.offsetTop;
      }
	}
	
	function setCurrent() {	
		var li = $("li."+opt.currentClass, $container).get(0);
		var ar = (''+li.id).split('_');
		var el = ar[ar.length-1];
//		$select.val(el);
//		$input.val($(li).html());
//		return true;
    if (opt.onChangeCallback){
    		$select.get(0).selectedIndex = $('li', $container).index(li);
    		opt.onChangeParams = { selectedVal : $select.val() };
		opt.onChangeCallback(opt.onChangeParams);
	} else {
		$select.val(el);
		$select.change();
	}
	if(opt.inputType == 'span') $input.html($(li).html());
	else $input.val($(li).html());
	return true;
	
	}
	
	// select value
	function getCurrentSelected() {
		return $select.val();
	}
	
	// input value
	function getCurrentValue() {
		return $input.val();
	}
	
	function getSelectOptions(parentid) {
		var select_options = new Array();
		var ul = document.createElement('ul');
		$select.children('option').each(function() {
			var li = document.createElement('li');
			li.setAttribute('id', parentid + '_' + $(this).val());
			li.innerHTML = $(this).html();
			if ($(this).is(':selected')) {
				$input.val($(this).html());
				$(li).addClass(opt.currentClass);
			}
			ul.appendChild(li);
			$(li)
			.mouseover(function(event) {
				hasfocus = 1;
				if (opt.debug) console.log('over on : '+this.id);
				jQuery(event.target, $container).addClass(opt.hoverClass);
			})
			.mouseout(function(event) {
				hasfocus = -1;
				if (opt.debug) console.log('out on : '+this.id);
				jQuery(event.target, $container).removeClass(opt.hoverClass);
			})
			.click(function(event) {
			  var fl = $('li.'+opt.hoverClass, $container).get(0);
				if (opt.debug) console.log('click on :'+this.id);
				$('#' + elm_id + '_container' + ' li.'+opt.currentClass).removeClass(opt.currentClass); 
				$(this).addClass(opt.currentClass);
				setCurrent();
				//$select.change();
				$select.get(0).blur();
				hideMe();
			});
		});
		return ul;
	}
};


/**
 * 字符串是否有值 str:要检测的字符串
 */
function isEmpty(str) {
	if (str != null && str.length > 0) {
		return true;
	}
	return false;
}



/**
 * 按钮倒计时
 * @param btn 按钮JQUERY对象
 * @param defaultStr 默认按钮名称
 * @param count 倒计时时长
 */
function timeBtn(btn, defaultStr, count) {
	var countdown = setInterval(CountDown, 1000);
	function CountDown() {
		btn.val("请等待 (" + count + ")秒");
		if (count == 0) {
//			btn.val(defaultStr).removeAttr("disabled");
			btn.val(defaultStr);
			btn.removeAttr("disabled");
			btn.attr('class','hqyzm_btn color1'); 
			clearInterval(countdown);
		}
		count--;
	}
}



/***********************************分页开始**************************************/

/**
 *根据jquery获取取
 */
function getValByID(id) {
	return $("#" + id).val();
}
/**
 *根据jquery name获取取
 */
function getValByName(name) {
	return $("input[name='" + name + "']").val();
}

function setValByName(name, value) {
	return $("input[name='" + name + "']").val(value);
}

function setValById(id, value) {
	return $("#" + id).val(value);
}

/**
 *字符串是否有值
 *str:要检测的字符串
 */
function isEmpty(str) {
	if (str != null && str.length > 0) {
		return true;
	}
	return false;
}
function submitPage(n){
 $("#currentPage").val(n);
  document.forms[0].submit();
}


$(function(){
	$("#form_submit").bind("click", function() {
		$("#currentPage").val(0);
	});

	$("#search_form").click(function() {
		$("#currentPage").val(0);
		document.forms[0].submit();
	});
});

function tabChange(obj) {
	setValById("hid_status", obj);
	$("#currentPage").val(0);
	document.forms[0].submit();
}

//比较日期大小
function checkDate(sourceDate) {
	sourceDate = sourceDate.replace("-", "/"); //替换字符，变成标准格式
	var d2 = new Date(); //取今天的日期
	var d1 = new Date(Date.parse(sourceDate));
	if (d1 > d2) {
		return true;
	}
}

function placeholder() {
	var doc = document,
	inputs = doc.getElementsByTagName('input'),
	supportPlaceholder = 'placeholder' in doc.createElement('input'),
	placeholder = function(
	input) {
		var text = input.getAttribute('placeholder'),
		defaultValue = input.defaultValue;
		if (defaultValue == '') {
			input.value = text
		}
		input.onfocus = function() {
			if (input.value === text) {
				this.value = ''
			}
		};
		input.onblur = function() {
			if (input.value === '') {
				this.value = text
			}
		}
	};
	if (!supportPlaceholder) {
		for (var i = 0, len = inputs.length; i < len; i++) {
			var input = inputs[i],
			text = input.getAttribute('placeholder');
			if (input.type === 'text' && text) {
				placeholder(input)
			}
		}
	}
}

$(document).ready(function(){
	
	// === Sidebar navigation === //
	
	$('.q_nar ul li > a').click(function(e)
	{
		e.preventDefault();
		var submenu = $(this).siblings('ul');
		var li = $(this).parents('li');
		var submenus = $('.q_nar ul li dl');
		var submenus_parents = $('.q_nar ul li ');
		if(li.hasClass('q_li_block'))
		{
			li.removeClass('q_li_block');	
		} else 
		{
			submenus_parents.removeClass('q_li_block');
			li.addClass('q_li_block');
		}
	});
	
	var ul = $('.q_nar > ul');
	
	$('.q_nar  > a').click(function(e)
	{
		e.preventDefault();
		var sidebar = $('.q_nar');
		if(sidebar.hasClass('q_li_block'))
		{
			sidebar.removeClass('q_li_block');
			ul.slideUp(250);
		} else 
		{
			sidebar.addClass('q_li_block');
			ul.slideDown(250);
		}
		
	});
	
	  //更改点击后菜单样式
	$(".noclass").click(function(){
		$(".active").attr("class","noclass");
		$(this).attr("class","active");
	})


});

