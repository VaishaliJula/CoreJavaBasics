
public class Vehicle5 {

	float max_speed;
	int num_wheels;
	public Vehicle5() {
		this(60,2);
	}
	public Vehicle5(float m_speed,int n_wheels) {
		max_speed = m_speed;
		num_wheels = n_wheels;
	}
	public String toString() {
		return "max speed\t" +max_speed+"\nnum wheels\t"+num_wheels;
	}
	public float getmax_speed() {
		 return max_speed;
	}
	
	public void setmax_speed(float m_speed) {
		max_speed = m_speed;
	}
	public float getnum_wheels() {
		 return num_wheels;
	}
	public void setnum_wheels(int n_wheels) {
		num_wheels = n_wheels;
		
	}

}
