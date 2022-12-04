package com.xworkz.abstraction.constructor;

public class Bmrcl {
	private MetroRules rule;

	public Bmrcl(MetroRules rule) {
		super();
		this.rule = rule;
	}
	 public void checkRules() {
		 if(rule!=null) {
			 int dist=this.rule.maintainDistanceFromTrack();
			 boolean drunk=this.rule.drunkAllowed();
			 if(dist>2 && drunk==false) {
				 System.out.println("rules are followed by passengers");
			 }
			 else {
				 System.out.println("rules are not followed by passengers");
			 }
		 }
	 }

}
