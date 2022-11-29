package com.xworkz.interfaces.invitation.boot;

import com.xworkz.interfaces.invitation.Invitation;
import com.xworkz.interfaces.invitation.WeddingInvitation;

public class WeddingInvitationRunner {

	public static void main(String[] args) {
		WeddingInvitation wed=new WeddingInvitation();
		wed.cardQuality();
		wed.cardSize();
		wed.cardType();
		wed.month();
		wed.venue();
		wed.isConfirmDate();
		
		Invitation invite=new WeddingInvitation();
		invite.cardSize();
		invite.cardType();
		invite.cardQuality();
		invite.month();
		invite.venue();
	}

}
