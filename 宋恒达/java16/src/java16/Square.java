package java16;

public class Square extends Shape{
		private double height=0;

		public Square(double height) {
			super();
			this.height = height;
		}

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return (this.height*this.height);
		}
		
}
