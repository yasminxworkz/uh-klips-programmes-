package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.IPLDto;
import com.xworkz.crud.repository.IPLRepository;
import com.xworkz.crud.repository.IPLRepositoryImp;

public class IPLRunner {

	
	
	public static void main(String[] args)	{
	
	
		
		
		IPLRepository repository=new IPLRepositoryImp();
		IPLDto dto=new IPLDto();
		IPLDto ipl=new IPLDto();
		IPLDto cricket=new IPLDto();
		IPLDto game=new IPLDto();
		IPLDto play=new IPLDto();
		IPLDto visit=new IPLDto();
		IPLDto prize=new IPLDto();
		IPLDto trophy=new IPLDto();
		IPLDto runs=new IPLDto();
		IPLDto bat=new IPLDto();
		
		dto.setTeamName("RCB");
		dto.setCaptainName("Virat kohli");
		dto.setCreatedBy("SYSTEM");
		dto.setCreatedDate(LocalDateTime.now());
		dto.setDefeats(113);
		dto.setOwnerAlive(true);
		dto.setCoach(" Sridharan Sriram ");
		dto.setUpdatedBy(null);
		dto.setUpdatedDate(null);
		dto.setWins(107);
		
		repository.create(dto);
		
		
		ipl.setTeamName("Chennai Super Kings");
		ipl.setCaptainName(": Ravindra Jadeja");
		ipl.setCreatedBy("SYSTEM");
		ipl.setCreatedDate(LocalDateTime.now());
		ipl.setDefeats(11);
		ipl.setOwnerAlive(true);
		ipl.setCoach(" Stephen Fleming");
		ipl.setUpdatedBy(null);
		ipl.setUpdatedDate(null);
		ipl.setWins(16);
		
		repository.create(ipl);
		
		cricket.setTeamName("Mumbai Indians");
		cricket.setCaptainName( "Rohit Sharma");
		cricket.setCreatedBy(" Reliance Industries Limited");
		cricket.setCreatedDate(LocalDateTime.now());
		cricket.setDefeats(6);
		cricket.setOwnerAlive(false);
		cricket.setCoach(" Mahela Jayawardene");
		cricket.setUpdatedBy(null);
		cricket.setUpdatedDate(null);
		cricket.setWins(5);
		
		repository.create(cricket);
		
		game.setTeamName("Kolkata Knight Riders ");
		game.setCaptainName(" Shreyas Iyer");
		game.setCreatedBy(" Red Chillies Entertainment");
		game.setCreatedDate(LocalDateTime.now());
		game.setDefeats(2);
		game.setOwnerAlive(false);
		game.setCoach(" Chandrakant Pandit ");
		game.setUpdatedBy(null);
		game.setUpdatedDate(null);
		game.setWins(5);
		
		repository.create(game);
		
		play.setTeamName("Rajasthan Royals ");
		play.setCaptainName(" Sanju Samson");
		play.setCreatedBy(" Manoj Badale");
		play.setCreatedDate(LocalDateTime.now());
		play.setDefeats(68);
		play.setOwnerAlive(true);
		play.setCoach(" Andrew McDonald");
		play.setUpdatedBy(null);
		play.setUpdatedDate(null);
		play.setWins(6);
		
		repository.create(play);
		
		visit.setTeamName("Punjab Kings");
		visit.setCaptainName(" Mayank Agarwal");
		visit.setCreatedBy("Preity Zinta");
		visit.setCreatedDate(LocalDateTime.now());
		visit.setDefeats(5);
		visit.setOwnerAlive(true);
		visit.setCoach(" Anil Kumble");
		visit.setUpdatedBy(null);
		visit.setUpdatedDate(null);
		visit.setWins(6);
		
		repository.create(visit);
		System.out.println(repository.total());
		
		prize.setTeamName("Sunrisers Hyderabad");
		prize.setCaptainName(" Kane Williamson");
		prize.setCreatedBy(" Sun TV Network");
		prize.setCreatedDate(LocalDateTime.now());
		prize.setDefeats(2);
		prize.setOwnerAlive(false);
		prize.setCoach("Tom Moody");
		prize.setUpdatedBy(null);
		prize.setUpdatedDate(null);
		prize.setWins(3);
		
		repository.create(prize);
		
		trophy.setTeamName("Gujarat Titans");
		trophy.setCaptainName("Hardik Pandya");
		trophy.setCreatedBy("CVC Capital Partners");
		trophy.setCreatedDate(LocalDateTime.now());
		trophy.setDefeats(4);
		trophy.setOwnerAlive(true);
		trophy.setCoach(" Gary Kirsten");
		trophy.setUpdatedBy(null);
		trophy.setUpdatedDate(null);
		trophy.setWins(10);
		
		repository.create(trophy);
		
		runs.setTeamName("Lucknow Super Giants");
		runs.setCaptainName(" KL Rahul");
		runs.setCreatedBy("RPSG Group");
		runs.setCreatedDate(LocalDateTime.now());
		runs.setDefeats(10);
		runs.setOwnerAlive(true);
		runs.setCoach(" Andy Flower");
		runs.setUpdatedBy(null);
		runs.setUpdatedDate(null);
		runs.setWins(12);
		
		repository.create(runs);
		
		bat.setTeamName("Delhi Capitals ");
		bat.setCaptainName(" Rishabh Pant");
		bat.setCreatedBy(" GMR Group");
		bat.setCreatedDate(LocalDateTime.now());
		bat.setDefeats(9);
		bat.setOwnerAlive(true);
		bat.setCoach(" Ricky Ponting ");
		bat.setUpdatedBy(null);
		bat.setUpdatedDate(null);
		bat.setWins(11);

		repository.create(bat);
		
		bat.setTeamName("Delhi Capitals ");
		bat.setCaptainName(" Rishabh Pant");
		bat.setCreatedBy(" GMR Group");
		bat.setCreatedDate(LocalDateTime.now());
		bat.setDefeats(9);
		bat.setOwnerAlive(true);
		bat.setCoach(" Ricky Ponting ");
		bat.setUpdatedBy(null);
		bat.setUpdatedDate(null);
		bat.setWins(11);

		repository.create(bat);
	
	
	}

}
