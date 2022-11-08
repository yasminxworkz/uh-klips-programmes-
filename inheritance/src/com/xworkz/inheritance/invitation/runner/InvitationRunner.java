package com.xworkz.inheritance.invitation.runner;

import com.xworkz.inheritance.invitation.constructor.Invitation;
import com.xworkz.inheritance.invitation.constructor.WeddingInvitation;

public class InvitationRunner {

	public static void main(String[] args) {
		Invitation invite=new WeddingInvitation("paper", "idgaHall", 2);
		System.out.println(invite.cardType);
		System.out.println(invite.venue);
		System.out.println(invite.month);
		
	}

}
