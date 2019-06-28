package com.yr.computer;

public class MainBoard {
	//mainBoard는 cpu, hardDisk, ram, vga에 의존적임
	
	private Cpu cpu;
	private HardDisk hardDisk;
	private Ram ram;
	private Vga vga;
	
	
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public HardDisk getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	public Vga getVga() {
		return vga;
	}
	public void setVga(Vga vga) {
		this.vga = vga;
	}
	
}
