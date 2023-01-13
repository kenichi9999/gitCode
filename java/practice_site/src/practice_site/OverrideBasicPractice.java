package practice_site;

public class OverrideBasicPractice {
	public static void main(String[] ags) {
		Clock cl = new Clock(10,15,30);
		
		cl.showData();
		
		System.out.println();
		
		AlarmClock c2 = new AlarmClock(15,45,20,6,30);
		c2.showData();
	}
}


class Clock{
	private int hour;
	private int minute;
	private int second;
	
	public Clock(int hour ,int minute , int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void showData() {
		System.out.println("只今の時刻："+hour+"時"+minute + "分"+ second + "秒");
	}
}

class AlarmClock extends Clock{
	private int alarmHour;
	private int alarmMinute;
	
	AlarmClock(int hour,int minute,int second,int alarmHour,int alarmMinute){
			super(hour,minute,second);
			this.alarmHour = alarmHour;
			this.alarmMinute = alarmMinute;
	}
	
	@Override
	public void showData() {
		super.showData();
		System.out.println("アラーム設定時刻："+alarmHour + "時"+alarmMinute + "分");
	}
}