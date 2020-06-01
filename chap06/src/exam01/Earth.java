package exam01;

public class Earth {
	static final double EARTH_RADIUS = 6400; //초기화 방법 1: 선언과 동시에 초기화
	static final double EARTH_SURFACE_AREA;
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS; //초기화 방법 2
	}
}
