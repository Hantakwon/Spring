package kr.co.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    // 필드 주입
    @Autowired
    private CPU cpu;
    private RAM ram;
    private HDD hdd;

    // 생성자 주입
    @Autowired
    public Computer(RAM ram) {
        this.ram = ram;
    }

    // 세터 주입
    @Autowired
    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }
    
    public void show(){
        cpu.show();
        ram.show();
        hdd.show();
    }
}
