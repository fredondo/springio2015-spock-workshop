package org.startrek;

public class TargetDestroyedException extends Exception {
	public TargetDestroyedException() {
	}
	
	TargetDestroyedException(String msg){
		super(msg);
	}
}
