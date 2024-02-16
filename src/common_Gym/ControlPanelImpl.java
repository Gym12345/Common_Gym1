package common_Gym;


public class ControlPanelImpl implements ControlPanel{
	
	
	private static ControlPanelImpl instanceOfControlPanelImpl=new ControlPanelImpl();
	
	public static ControlPanelImpl getInstance() {//현재클래스의 메소드접근을 메소드로만가능하게
		return instanceOfControlPanelImpl;
	}
	
	
	
	
	
	@Override
	public void ControlWind() {   // People A
		
		
	}

	@Override
	public void ControlTemperature() {   //People B
		
		
		
		
	}
	
	
	
}
