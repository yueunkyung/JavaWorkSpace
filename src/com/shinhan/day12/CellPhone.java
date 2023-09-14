package com.shinhan.day12;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"model"})
public class CellPhone {

	@NonNull String model;
	double battery;
	//객체 생성시 멤버변수는 자동초기화 된다. 
	//Double타입은 null
	//double타입은 0
/*
	CellPhone(String model) {
		this.model = model;
	}
*/
	protected CellPhone(@NonNull String model, double battery) {
		super();
		this.model = model;
		this.battery = battery;
	}

	//Exception > RuntimeException > IllegalArgumentException
	//RuntimeException 하위는 unchecked exception
	//Exception 처리 하지 않으면 자동으로 던진다. JVM 오류 메세지 주고 프로그램 중단
	public void call(int time) throws IllegalArgumentException {
		if(time<0) throw new IllegalArgumentException("통화시간입력오류");
		System.out.printf("통화 시간 : %d분\n", time);
		battery -= time * 0.5;
		if(battery<0) battery = 0;
	}
	
	public void charge(int time) throws IllegalArgumentException {
		if(time<0) throw new IllegalArgumentException("충전시간입력오류");
		System.out.printf("충전 시간 : %3d분\n", time);
		battery += time * 3;
		if(battery>100) battery = 100;
	}

	public void printBattery() {
		System.out.printf("남은 배터리 양 : %.1f\n", battery);
	}
/*
	@Override
	public int hashCode() {
		return Objects.hash(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone other = (CellPhone) obj;
		return Objects.equals(model, other.model);
	}
*/
}
