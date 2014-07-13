package br.com.supermercado;

public class Hora {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Hora(int hour, int minute, int second){
		
		if(hours>=0 && hours<24){
			this.hours = hour;	
		}
		else{
			throw new IllegalArgumentException("Hora inválida");
		}
		
		
		if(minutes>=0 && minutes<60){
			this.minutes = minute;
		}
		else{
			throw new IllegalArgumentException("Minutos inválidos");
		}
		
		if(seconds>=0 && seconds<60){
			this.seconds = second;
		}
		else{
			throw new IllegalArgumentException("Segundos inválidos");
		}
	}
	
	@Override
	public String toString(){
		return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
	}
	
	public int getHour(){
		return this.hours;
	}
	
	public int getMinute(){
		return this.minutes;
	}
	
	public int getSecond(){
		return this.seconds;
	}

}
