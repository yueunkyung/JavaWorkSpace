package com.shinhan.day09;

public class TV implements Volume {
	int VolLevel;

	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		System.out.println(getClass().getSimpleName()+"볼륨 올립니다." + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		if (VolLevel < 0)
			VolLevel = 0;
		System.out.println(getClass().getSimpleName()+"볼륨 내립니다." + VolLevel);

	}

}
