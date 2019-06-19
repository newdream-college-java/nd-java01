package cn.song.vo;

import cn.song.entity.Inssure;
import cn.song.entity.Station;
import cn.song.entity.Ticket;
import cn.song.entity.TripOrder;

public class OrderListVo {
		private Station startStation;
		private Station endStation;
		private Ticket ticket;
		private Inssure inssure;
		private TripOrder tripOrder;
		
		public TripOrder getTripOrder() {
			return tripOrder;
		}
		public void setTripOrder(TripOrder tripOrder) {
			this.tripOrder = tripOrder;
		}
		public Station getStartStation() {
			return startStation;
		}
		public void setStartStation(Station startStation) {
			this.startStation = startStation;
		}
		public Station getEndStation() {
			return endStation;
		}
		public void setEndStation(Station endStation) {
			this.endStation = endStation;
		}
		public Ticket getTicket() {
			return ticket;
		}
		public void setTicket(Ticket ticket) {
			this.ticket = ticket;
		}
		public Inssure getInssure() {
			return inssure;
		}
		public void setInssure(Inssure inssure) {
			this.inssure = inssure;
		}
		
}
