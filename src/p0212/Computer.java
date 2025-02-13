package p0212;

public class Computer {
	private String cpu;
	private String ran;
	private String Gpu
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRan() {
		return ran;
	}
	public void setRan(String ran) {
		this.ran = ran;
	}
	public String getGpu() {
		return Gpu;
	}
	public void setGpu(String gpu) {
		Gpu = gpu;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ran=" + ran + ", Gpu=" + Gpu + ", getCpu()=" + getCpu() + ", getRan()="
				+ getRan() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
