package ctec.p3compendium.model;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class Persona3State extends Application
{
	private int [][] stats;
	private String[] charName;
	private String [][] arcanas;
	private String charType;
	private String[] foolArcana ,magicianArcana,priestessArcana,empressArcana,emperorArcana,heirophantArcana,loversArcana,chariotArcana,justiceArcana, 
					hermitArcana,fortuneArcana,strengthArcana,hangedmanArcana,deathArcana,tempranceArcana,devilArcana,towerArcana,starArcana,        
					moonArcana,sunArcana,judgmentArcana,aeonArcana; 
	private String [] [] Personas;
	private String [] Orpheus,Slime,Legion,Ose, BlackFrost,Decarabia,Loki,Susanoo,OrpheusTelos,Nekomat,JackFrost,PyroJack,
					  HuaPo,Sati,Orobas,Rangda,Surt,Apsaras,Unicorn,HighPixie,Sarasvati,Ganga,Parvati,Kikurihime,Scathach,LeananSidhe,
					  Yaksini,Laksmi,Hariti,Gabriel,MotherHarlot,Skadi,Alilat,Forneus,Oberon,TakeMikazuchi,KingFrost,RajaNaga,Kingu,
					  Barong,Odin,Omoikane,Berith,Shiisaa,Flauros,Thoth,HokutoSeikun,Daisoujou,Kohryu,Pixie,Alp,Narcissus,QueenMab,
					  SakiMitama,Titania,Raphael,Cybele,AraMitama,Chimera,Zouchouten,Ares,Oumitsunu,NataTaishi,Koumokuten,Thor,Angel,
					  Archangel,Principlaity,Power,Virtue,Dominion,Throne,Melchizedek,YomotsuShikome,Naga,Lamia,Mothman,Taraka,KuramaTengu,
					  Nebrios,Kumbhanda,Arahabaki,Fortuna,Empus,KusiMitama,Clotho,Lachesis,Atropos,Norn,Cerberus,Valkyrie,Rakshasa,Titan,
					  Jikoukuten,Hanuman,Narashima,Kali,Siegfried,Inugami,TakaMinakata,Orthrus,Vasuki,Ubelluris,Hecatoncheires,HellBiker,
					  Attis,Ghoul,PaleRider,Loa,Samael,Mot,Alice,Thanatos,NigiMitama,Mithra,Genbu,Seiryuu,Okuninushi,Suzaku,Byakko,
					  Yurlungur,Lilim,Vetala,Incubus,Succubus,Pazuzu,Lilith,Abaddon,Beelzebub,Eligor,ChuChulainn,Bishamonten,SeitenTaisei,
					  Masakado,Mara,Shiva,ChiYou,Nandi,Kaiwan,Ganesha,Garuda,Kartikeya,Saturnus,Helel,Gurr,YamatanoOrochi,Girimehkala,
					  Dionysus,Chernobog,Seth,BaalZebul,Sandalphon,Yatagarasu,Quetzalcoatl,Jatayu,Horus,Sparna,Vishnu,Asura,Anubis,
					  Trumpeter,Michael,Satan,Lucifer,Messiah,Uriel,Nidhogg,Ananta,Atavaka,Metatron;
	
	private int selectedIndex;
	
	
	public void onCreate()
	{
		
	/**
	 * The Arrays of what needs to be passed to the Arcanas screen and then put into it's listview.
	 */
		selectedIndex = -1;
		
		
		
		
		
		foolArcana = new String []
			{
				"Orpheus",
				"Slime",
				"Legion",
				"Ose",
				"Black Frost",
				"Decarabia",
				"Loki",
				"Susano-o",
				"Orpheus Telos",
			};
		
		magicianArcana = new String[]
			{
				"Nekomata",
				"Jack Frost",
				"Pyro Jack",
				"Hua Po",
				"Sati",
				"Orobas",
				"Rangda",
				"Surt"
			};
		priestessArcana = new String []
				{
				"Apsaras",
				"Unicorn",
				"High Pixie",
				"Sarasvati",
				"Ganga",
				"Parvati",
				"Kikuri-hime",
				"Scathach",
				};
		
		empressArcana = new String []
				{
				"Leanan Sidhe",
				"Yaksini",
				"Laksmi",
				"Hariti",
				"Gabriel",
				"Mother Harlot",
				"Skadi",
				"Alilat"
				};
				
		emperorArcana = new String []
				{
				"Forneus",
				"Oberon",
				"Take-Mikazuchi",
				"King Frost",
				"Raja Naga",
				"Kingu",
				"Barong",
				"Odin"
				};
		heirophantArcana = new String []
				{
				"Omoikane",
				"Berith",
				"Shiisaa",
				"Flauros",
				"Thoth",
				"Hokuto Seikun",
				"Daisoujou",
				"Kohryu"
				};
		loversArcana = new String []
				{
				"Pixie",
				"Alp",
				"Narcissus",
				"Queen Mab",
				"Saki Mitama",
				"Titania",
				"Raphael",
				"Cybele"
				};
		chariotArcana = new String []
				{
				"Ara Mitama",
				"Chimera",
				"Zouchouten",
				"Ares",
				"Oumitsunu",
				"Nata Taishi",
				"Koumokuten",
				"Thor"
				};
		justiceArcana = new String []
				{
				"Angel",
				"Archangel",
				"Principlaity",
				"Power",
				"Virtue",
				"Dominion",
				"Throne",
				"Melchizedek"
				};
		hermitArcana = new String []
				{
				"Yomotsu-Shikome",
				"Naga",
				"Lamia",
				"Mothman",
				"Taraka",
				"Kurama Tengu",
				"Nebrios",
				"Kumbhanda",
				"Arahabaki"
				};
		fortuneArcana = new String []
				{
				"Fortuna",
				"Empus",
				"Kusi Mitama",
				"Clotho",
				"Lachesis",
				"Atropos",
				"Norn"
				};
		strengthArcana = new String []
				{
				"Cerberus",
				"Valkyrie",
				"Rakshasa",
				"Titan",
				"Jikoukuten",
				"Hanuman",
				"Narashima",
				"Kali",
				"Siegfried"
				};
		hangedmanArcana = new String []
				{
				"Inugami",
				"Taka-Minakata",
				"Orthrus",
				"Vasuki",
				"Ubelluris",
				"Hecatoncheires",
				"Hell Biker",
				"Attis"
				};
		deathArcana = new String []
				{
				"Ghoul",
				"Pale Rider",
				"Loa",
				"Samael",
				"Mot",
				"Alice",
				"Thanatos"
				};
		tempranceArcana = new String []
				{
				"Nigi Mitama",
				"Mithra",
				"Genbu",
				"Seiryuu",
				"Okuninushi",
				"Suzaku",
				"Byakko",
				"Yurlungur"
				};
		devilArcana = new String []
				{
				"Lilim",
				"Vetala",
				"Incubus",
				"Succubus",
				"Pazuzu",
				"Lilith",
				"Abaddon",
				"Beelzebub"
				};
		towerArcana = new String []
				{
				"Eligor",
				"Chu Chulainn",
				"Bishamonten",
				"Seiten Taisei",
				"Masakado",
				"Mara",
				"Shiva",
				"Chi You"
				};
		starArcana = new String []
				{
				"Nandi",
				"Kaiwan",
				"Ganesha",
				"Garuda",
				"Kartikeya",
				"Saturnus",
				"Helel"
				};
		moonArcana = new String []
				{
				"Gurr",
				"Yamata-no-Orochi",
				"Girimehkala",
				"Dionysus",
				"Chernobog",
				"Seth",
				"Baal Zebul",
				"Sandalphon"
				};
		sunArcana = new String []
				{
				"Yatagarasu",
				"Quetzalcoatl",
				"Jatayu",
				"Horus",
				"Sparna",
				"Vishnu",
				"Asura"
				};
		judgmentArcana = new String []
				{
				"Anubis",
				"Trumpeter",
				"Michael",
				"Satan",
				"Lucifer",
				"Messiah"
				};
		aeonArcana = new String []
				{
				"Uriel",
				"Nidhogg",
				"Ananta",
				"Atavaka",
				"Metatron"
				};
		
				
				
	
		
		/**
		 *  The numerical values of Level, Strength, Magic, Endurance, Agility, Luck.
		 */
		stats = new int [][]
				{ 
				
					/**
					 * Fool
					 */
					{1,2,2,2,2,2},
					{12,9,9,7,8,10},
					{22,17,15,18,8,15},
					{34,23,25,25,26,26},
					{44,32,26,30,27,24},
					{50,28,39,29,29,32},
					{58,41,47,30,42,21},
					{76,57,51,53,49,53},
					{90,75,72,72,72,72},
					/**
					 * Magician
					 */
					{5,4,6,5,3,4},
					{8,5,8,8,4,6},
					{14,7,14,9,8,11},
					{20,10,19,11,14,13},
					{28,17,25,18,16,15},
					{34,20,29,21,22,27},
					{40,25,35,24,22,21},
					{52,40,49,35,26,32},
					/**
					 * Priestess
					 */
					{3,3,4,3,2,4},
					{11,7,10,8,9,6},
					{21,13,18,12,11,16},
					{27,13,23,14,20,18},
					{35,18,28,21,22,23},
					{47,24,38,25,32,33},
					{53,29,45,28,30,34},
					{64,51,53,29,49,40},
					/**
					 * Empress
					 */
					{33,19,34,20,24,22},
					{50,33,32,26,33,33},
					{57,31,45,32,33,37},
					{62,38,44,34,39,38},
					{69,43,49,35,45,42},
					{74,48,55,50,43,51},
					{80,48,57,47,45,50},
					{84,64,61,52,60,53},
					/**
					 * Emperor
					 */
					{7,5,5,8,6,4},
					{15,12,15,9,8,8},
					{24,19,18,13,15,14},
					{30,20,23,22,15,24},
					{36,24,26,23,21,21},
					{46,31,37,30,28,29},
					{52,40,36,30,28,29},
					{57,39,52,33,36,39},
					/**
					 * Heirophant
					 */
					{7,4,7,6,4,7},
					{13,11,10,9,7,9},
					{26,18,18,17,17,15},
					{33,25,25,20,18,18},
					{41,23,32,26,23,26},
					{47,28,35,35,25,29},
					{53,32,44,36,29,38},
					{61,46,48,53,27,38},
					/**
					 * Lovers
					 */
					{2,2,3,2,3,3},
					{6,3,7,5,5,5},
					{20,12,18,9,13,20},
					{27,16,21,16,12,23},
					{39,20,32,20,22,30},
					{48,19,39,23,31,39},
					{61,44,42,31,31,42},
					{68,49,55,40,42,50},
					/**
					 * Chariot
					 */
					{6,6,4,6,4,5},
					{9,8,4,9,8,5},
					{14,16,4,13,7,9},
					{19,17,10,15,9,13},
					{30,26,14,26,11,20},
					{37,29,19,24,29,26},
					{43,35,24,31,21,25},
					{53,42,45,34,30,34},
					/**0
					 * Justice
					 */
					{4,4,5,3,4,3},
					{10,8,8,8,7,6},
					{16,12,13,7,11,12},
					{25,20,19,15,16,12},
					{32,22,23,15,20,23},
					{42,28,33,24,25,23},
					{51,35,32,26,34,33},
					{59,50,46,43,36,31},
					/**
					 * Hermit
					 */
					{9,3,8,9,10,4},
					{17,16,10,12,14,8},
					{25,15,20,12,18,17},
					{32,15,25,19,27,25},
					{38,27,23,26,28,17},
					{44,27,31,30,35,18},
					{50,31,42,32,34,30},
					{56,38,37,35,45,20},
					{60,42,50,51,32,34},
					/**
					 * Fortune
					 */
					{17,9,14,10,15,10},
					{23,10,20,10,16,20},
					{29,16,23,20,11,24},
					{38,20,29,22,21,29},
					{45,26,36,19,31,30},
					{54,26,45,27,31,40},
					{62,40,54,32,46,44},
					/**
					 * Strength
					 */
					{11,10,7,8,8,7},
					{16,16,8,16,10,8},
					{23,23,10,18,11,14},
					{29,24,19,19,14,18},
					{37,26,23,20,22,27},
					{46,36,27,28,28,26},
					{55,42,30,33,36,31},
					{59,50,43,40,41,35},
					/**
					 * Hanged man
					 */
					{10,6,11,10,6,4},
					{21,16,16,19,10,9},
					{28,22,14,20,21,14},
					{38,27,27,30,19,18},
					{48,32,29,40,24,26},
					{54,37,32,45,20,35},
					{60,49,35,49,40,14},
					{67,51,59,61,54,40},
					/**
					 * Death
					 */
					{18,13,15,15,11,11},
					{24,20,19,15,19,12},
					{31,21,26,24,19,18},
					{37,27,31,26,20,23},
					{45,31,37,34,22,29},
					{56,31,50,27,42,39},
					{64,48,51,44,44,39},
					/**
					 * Temperance
					 */
					{12,9,8,10,9,10},
					{22,17,20,17,11,13},
					{29,19,22,26,12,22},
					{36,26,24,27,22,25},
					{44,33,37,27,26,29},
					{51,32,39,32,40,29},
				    {57,49,36,34,48,32},
				    {64,43,47,49,34,41},
				    /**
					 * Devil
					 */
					{8,4,10,6,6,7},
					{24,21,17,21,13,19},
					{34,21,30,20,21,25},
					{43,24,36,27,32,27},
					{52,34,41,31,36,34},
					{61,39,52,38,40,36},
					{68,49,52,49,33,44},
					{71,50,55,47,44,41},
					/**
					 * Tower
					 */
					{31,28,19,23,22,18},
					{40,33,28,30,23,25},
					{60,47,44,41,35,39},
					{67,51,38,43,51,45},
					{73,56,42,52,49,45},
					{77,60,50,52,48,51},
					{82,60,55,48,59,56},
					{86,65,56,62,54,59},
					/**
					 * Star
					 */
					{39,29,26,29,17,32},
					{49,35,41,33,26,33},
					{58,48,35,39,32,40},
					{65,47,42,35,53,41},
					{70,52,44,42,53,43},
					{78,52,58,45,52,53},
					{88,64,63,61,57,58},
					/**
					 * Moon
					 */
					{15,13,9,12,13,9},
					{26,21,17,21,13,19},
					{42,32,30,24,28,29},
					{48,30,41,26,30,36},
					{58,46,47,32,36,34},
					{66,48,53,46,34,40},
					{71,50,55,47,44,41},
					{74,54,54,50,47,51},
					/**
					 * Sun
					 */
					{30,22,23,18,24,19},
					{43,28,29,30,32,30},
					{55,35,40,31,44,39},
					{63,49,50,33,44,39},
					{70,49,57,48,64,53},
					{78,53,58,47,56,51},
					{85,62,60,58,56,57},
					/**
					 * Judgment
					 */
					{59,41,50,38,37,36},
					{65,43,47,43,46,43},
					{72,51,47,46,50,51},
					{79,51,60,52,47,58},
					{89,65,68,64,52,52},
					{90,63,62,60,62,63},
					/**
					 * Aeon
					 */
					{63,44,51,41,41,38},
					{69,55,45,55,32,48},
					{75,52,56,60,39,48},
					{80,57,54,50,54,56},
					{87,61,65,57,61,56}
						

			
				};
		
		arcanas = new String[][] 
				{
					foolArcana,magicianArcana,priestessArcana,empressArcana,emperorArcana,heirophantArcana,loversArcana,chariotArcana,justiceArcana, 
					hermitArcana,fortuneArcana,strengthArcana,hangedmanArcana,deathArcana,tempranceArcana,devilArcana,towerArcana,starArcana,        
					moonArcana,sunArcana,judgmentArcana,aeonArcana
				};
		Personas = new String[][]
				{
				  Orpheus,Slime,Legion,Ose, BlackFrost,Decarabia,Loki,Susanoo,OrpheusTelos,Nekomat,JackFrost,PyroJack,
				  HuaPo,Sati,Orobas,Rangda,Surt,Apsaras,Unicorn,HighPixie,Sarasvati,Ganga,Parvati,Kikurihime,Scathach,LeananSidhe,
				  Yaksini,Laksmi,Hariti,Gabriel,MotherHarlot,Skadi,Alilat,Forneus,Oberon,TakeMikazuchi,KingFrost,RajaNaga,Kingu,
				  Barong,Odin,Omoikane,Berith,Shiisaa,Flauros,Thoth,HokutoSeikun,Daisoujou,Kohryu,Pixie,Alp,Narcissus,QueenMab,
				  SakiMitama,Titania,Raphael,Cybele,AraMitama,Chimera,Zouchouten,Ares,Oumitsunu,NataTaishi,Koumokuten,Thor,Angel,
				  Archangel,Principlaity,Power,Virtue,Dominion,Throne,Melchizedek,YomotsuShikome,Naga,Lamia,Mothman,Taraka,KuramaTengu,
				  Nebrios,Kumbhanda,Arahabaki,Fortuna,Empus,KusiMitama,Clotho,Lachesis,Atropos,Norn,Cerberus,Valkyrie,Rakshasa,Titan,
				  Jikoukuten,Hanuman,Narashima,Kali,Siegfried,Inugami,TakaMinakata,Orthrus,Vasuki,Ubelluris,Hecatoncheires,HellBiker,
				  Attis,Ghoul,PaleRider,Loa,Samael,Mot,Alice,Thanatos,NigiMitama,Mithra,Genbu,Seiryuu,Okuninushi,Suzaku,Byakko,
				  Yurlungur,Lilim,Vetala,Incubus,Succubus,Pazuzu,Lilith,Abaddon,Beelzebub,Eligor,ChuChulainn,Bishamonten,SeitenTaisei,
				  Masakado,Mara,Shiva,ChiYou,Nandi,Kaiwan,Ganesha,Garuda,Kartikeya,Saturnus,Helel,Gurr,YamatanoOrochi,Girimehkala,
				  Dionysus,Chernobog,Seth,BaalZebul,Sandalphon,Yatagarasu,Quetzalcoatl,Jatayu,Horus,Sparna,Vishnu,Asura,Anubis,
				  Trumpeter,Michael,Satan,Lucifer,Messiah,Uriel,Nidhogg,Ananta,Atavaka,Metatron
				};
		
	}

	public String[][] getArcanas()
	{
		return arcanas;
	}
	
	public String[][] getPersonas()
	{
		
		return Personas;
	}
	
	public int[][] getStats()
	{
		return stats;
	}


	public String[] getCharName()
	{
		return charName;
	}


	public String getCharType()
	{
		return charType;
	}


	public String[] getFoolArcana()
	{
		return foolArcana;
	}


	public String[] getMagicianArcana()
	{
		return magicianArcana;
	}


	public String[] getPriestessArcana()
	{
		return priestessArcana;
	}


	public String[] getEmpressArcana()
	{
		return empressArcana;
	}


	public String[] getEmperorArcana()
	{
		return emperorArcana;
	}


	public String[] getHeirophantArcana()
	{
		return heirophantArcana;
	}


	public String[] getLoversArcana()
	{
		return loversArcana;
	}


	public String[] getChariotArcana()
	{
		return chariotArcana;
	}


	public String[] getJusticeArcana()
	{
		return justiceArcana;
	}


	public String[] getHermitArcana()
	{
		return hermitArcana;
	}


	public String[] getFortuneArcana()
	{
		return fortuneArcana;
	}


	public String[] getStrengthArcana()
	{
		return strengthArcana;
	}


	public String[] getHangedmanArcana()
	{
		return hangedmanArcana;
	}


	public String[] getDeathArcana()
	{
		return deathArcana;
	}


	public String[] getTempranceArcana()
	{
		return tempranceArcana;
	}


	public String[] getDevilArcana()
	{
		return devilArcana;
	}


	public String[] getTowerArcana()
	{
		return towerArcana;
	}


	public String[] getStarArcana()
	{
		return starArcana;
	}


	public String[] getMoonArcana()
	{
		return moonArcana;
	}


	public String[] getSunArcana()
	{
		return sunArcana;
	}


	public String[] getJudgmentArcana()
	{
		return judgmentArcana;
	}


	public String[] getAeonArcana()
	{
		return aeonArcana;
	}


	public int getSelectedIndex()
	{
		return selectedIndex;
	}

	public String[] getOrpheus()
	{
		return Orpheus;
	}

	public String[] getSlime()
	{
		return Slime;
	}

	public String[] getLegion()
	{
		return Legion;
	}

	public String[] getOse()
	{
		return Ose;
	}

	public String[] getBlackFrost()
	{
		return BlackFrost;
	}

	public String[] getDecarabia()
	{
		return Decarabia;
	}

	public String[] getLoki()
	{
		return Loki;
	}

	public String[] getSusanoo()
	{
		return Susanoo;
	}

	public String[] getOrpheusTelos()
	{
		return OrpheusTelos;
	}

	public String[] getNekomat()
	{
		return Nekomat;
	}

	public String[] getJackFrost()
	{
		return JackFrost;
	}

	public String[] getPyroJack()
	{
		return PyroJack;
	}

	public String[] getHuaPo()
	{
		return HuaPo;
	}

	public String[] getSati()
	{
		return Sati;
	}

	public String[] getOrobas()
	{
		return Orobas;
	}

	public String[] getRangda()
	{
		return Rangda;
	}

	public String[] getSurt()
	{
		return Surt;
	}

	public String[] getApsaras()
	{
		return Apsaras;
	}

	public String[] getUnicorn()
	{
		return Unicorn;
	}

	public String[] getHighPixie()
	{
		return HighPixie;
	}

	public String[] getSarasvati()
	{
		return Sarasvati;
	}

	public String[] getGanga()
	{
		return Ganga;
	}

	public String[] getParvati()
	{
		return Parvati;
	}

	public String[] getKikurihime()
	{
		return Kikurihime;
	}

	public String[] getScathach()
	{
		return Scathach;
	}

	public String[] getLeananSidhe()
	{
		return LeananSidhe;
	}

	public String[] getYaksini()
	{
		return Yaksini;
	}

	public String[] getLaksmi()
	{
		return Laksmi;
	}

	public String[] getHariti()
	{
		return Hariti;
	}

	public String[] getGabriel()
	{
		return Gabriel;
	}

	public String[] getMotherHarlot()
	{
		return MotherHarlot;
	}

	public String[] getSkadi()
	{
		return Skadi;
	}

	public String[] getAlilat()
	{
		return Alilat;
	}

	public String[] getForneus()
	{
		return Forneus;
	}

	public String[] getOberon()
	{
		return Oberon;
	}

	public String[] getTakeMikazuchi()
	{
		return TakeMikazuchi;
	}

	public String[] getKingFrost()
	{
		return KingFrost;
	}

	public String[] getRajaNaga()
	{
		return RajaNaga;
	}

	public String[] getKingu()
	{
		return Kingu;
	}

	public String[] getBarong()
	{
		return Barong;
	}

	public String[] getOdin()
	{
		return Odin;
	}

	public String[] getOmoikane()
	{
		return Omoikane;
	}

	public String[] getBerith()
	{
		return Berith;
	}

	public String[] getShiisaa()
	{
		return Shiisaa;
	}

	public String[] getFlauros()
	{
		return Flauros;
	}

	public String[] getThoth()
	{
		return Thoth;
	}

	public String[] getHokutoSeikun()
	{
		return HokutoSeikun;
	}

	public String[] getDaisoujou()
	{
		return Daisoujou;
	}

	public String[] getKohryu()
	{
		return Kohryu;
	}

	public String[] getPixie()
	{
		return Pixie;
	}

	public String[] getAlp()
	{
		return Alp;
	}

	public String[] getNarcissus()
	{
		return Narcissus;
	}

	public String[] getQueenMab()
	{
		return QueenMab;
	}

	public String[] getSakiMitama()
	{
		return SakiMitama;
	}

	public String[] getTitania()
	{
		return Titania;
	}

	public String[] getRaphael()
	{
		return Raphael;
	}

	public String[] getCybele()
	{
		return Cybele;
	}

	public String[] getAraMitama()
	{
		return AraMitama;
	}

	public String[] getChimera()
	{
		return Chimera;
	}

	public String[] getZouchouten()
	{
		return Zouchouten;
	}

	public String[] getAres()
	{
		return Ares;
	}

	public String[] getOumitsunu()
	{
		return Oumitsunu;
	}

	public String[] getNataTaishi()
	{
		return NataTaishi;
	}

	public String[] getKoumokuten()
	{
		return Koumokuten;
	}

	public String[] getThor()
	{
		return Thor;
	}

	public String[] getAngel()
	{
		return Angel;
	}

	public String[] getArchangel()
	{
		return Archangel;
	}

	public String[] getPrinciplaity()
	{
		return Principlaity;
	}

	public String[] getPower()
	{
		return Power;
	}

	public String[] getVirtue()
	{
		return Virtue;
	}

	public String[] getDominion()
	{
		return Dominion;
	}

	public String[] getThrone()
	{
		return Throne;
	}

	public String[] getMelchizedek()
	{
		return Melchizedek;
	}

	public String[] getYomotsuShikome()
	{
		return YomotsuShikome;
	}

	public String[] getNaga()
	{
		return Naga;
	}

	public String[] getLamia()
	{
		return Lamia;
	}

	public String[] getMothman()
	{
		return Mothman;
	}

	public String[] getTaraka()
	{
		return Taraka;
	}

	public String[] getKuramaTengu()
	{
		return KuramaTengu;
	}

	public String[] getNebrios()
	{
		return Nebrios;
	}

	public String[] getKumbhanda()
	{
		return Kumbhanda;
	}

	public String[] getArahabaki()
	{
		return Arahabaki;
	}

	public String[] getFortuna()
	{
		return Fortuna;
	}

	public String[] getEmpus()
	{
		return Empus;
	}

	public String[] getKusiMitama()
	{
		return KusiMitama;
	}

	public String[] getClotho()
	{
		return Clotho;
	}

	public String[] getLachesis()
	{
		return Lachesis;
	}

	public String[] getAtropos()
	{
		return Atropos;
	}

	public String[] getNorn()
	{
		return Norn;
	}

	public String[] getCerberus()
	{
		return Cerberus;
	}

	public String[] getValkyrie()
	{
		return Valkyrie;
	}

	public String[] getRakshasa()
	{
		return Rakshasa;
	}

	public String[] getTitan()
	{
		return Titan;
	}

	public String[] getJikoukuten()
	{
		return Jikoukuten;
	}

	public String[] getHanuman()
	{
		return Hanuman;
	}

	public String[] getNarashima()
	{
		return Narashima;
	}

	public String[] getKali()
	{
		return Kali;
	}

	public String[] getSiegfried()
	{
		return Siegfried;
	}

	public String[] getInugami()
	{
		return Inugami;
	}

	public String[] getTakaMinakata()
	{
		return TakaMinakata;
	}

	public String[] getOrthrus()
	{
		return Orthrus;
	}

	public String[] getVasuki()
	{
		return Vasuki;
	}

	public String[] getUbelluris()
	{
		return Ubelluris;
	}

	public String[] getHecatoncheires()
	{
		return Hecatoncheires;
	}

	public String[] getHellBiker()
	{
		return HellBiker;
	}

	public String[] getAttis()
	{
		return Attis;
	}

	public String[] getGhoul()
	{
		return Ghoul;
	}

	public String[] getPaleRider()
	{
		return PaleRider;
	}

	public String[] getLoa()
	{
		return Loa;
	}

	public String[] getSamael()
	{
		return Samael;
	}

	public String[] getMot()
	{
		return Mot;
	}

	public String[] getAlice()
	{
		return Alice;
	}

	public String[] getThanatos()
	{
		return Thanatos;
	}

	public String[] getNigiMitama()
	{
		return NigiMitama;
	}

	public String[] getMithra()
	{
		return Mithra;
	}

	public String[] getGenbu()
	{
		return Genbu;
	}

	public String[] getSeiryuu()
	{
		return Seiryuu;
	}

	public String[] getOkuninushi()
	{
		return Okuninushi;
	}

	public String[] getSuzaku()
	{
		return Suzaku;
	}

	public String[] getByakko()
	{
		return Byakko;
	}

	public String[] getYurlungur()
	{
		return Yurlungur;
	}

	public String[] getLilim()
	{
		return Lilim;
	}

	public String[] getVetala()
	{
		return Vetala;
	}

	public String[] getIncubus()
	{
		return Incubus;
	}

	public String[] getSuccubus()
	{
		return Succubus;
	}

	public String[] getPazuzu()
	{
		return Pazuzu;
	}

	public String[] getLilith()
	{
		return Lilith;
	}

	public String[] getAbaddon()
	{
		return Abaddon;
	}

	public String[] getBeelzebub()
	{
		return Beelzebub;
	}

	public String[] getEligor()
	{
		return Eligor;
	}

	public String[] getChuChulainn()
	{
		return ChuChulainn;
	}

	public String[] getBishamonten()
	{
		return Bishamonten;
	}

	public String[] getSeitenTaisei()
	{
		return SeitenTaisei;
	}

	public String[] getMasakado()
	{
		return Masakado;
	}

	public String[] getMara()
	{
		return Mara;
	}

	public String[] getShiva()
	{
		return Shiva;
	}

	public String[] getChiYou()
	{
		return ChiYou;
	}

	public String[] getNandi()
	{
		return Nandi;
	}

	public String[] getKaiwan()
	{
		return Kaiwan;
	}

	public String[] getGanesha()
	{
		return Ganesha;
	}

	public String[] getGaruda()
	{
		return Garuda;
	}

	public String[] getKartikeya()
	{
		return Kartikeya;
	}

	public String[] getSaturnus()
	{
		return Saturnus;
	}

	public String[] getHelel()
	{
		return Helel;
	}

	public String[] getGurr()
	{
		return Gurr;
	}

	public String[] getYamatanoOrochi()
	{
		return YamatanoOrochi;
	}

	public String[] getGirimehkala()
	{
		return Girimehkala;
	}

	public String[] getDionysus()
	{
		return Dionysus;
	}

	public String[] getChernobog()
	{
		return Chernobog;
	}

	public String[] getSeth()
	{
		return Seth;
	}

	public String[] getBaalZebul()
	{
		return BaalZebul;
	}

	public String[] getSandalphon()
	{
		return Sandalphon;
	}

	public String[] getYatagarasu()
	{
		return Yatagarasu;
	}

	public String[] getQuetzalcoatl()
	{
		return Quetzalcoatl;
	}

	public String[] getJatayu()
	{
		return Jatayu;
	}

	public String[] getHorus()
	{
		return Horus;
	}

	public String[] getSparna()
	{
		return Sparna;
	}

	public String[] getVishnu()
	{
		return Vishnu;
	}

	public String[] getAsura()
	{
		return Asura;
	}

	public String[] getAnubis()
	{
		return Anubis;
	}

	public String[] getTrumpeter()
	{
		return Trumpeter;
	}

	public String[] getMichael()
	{
		return Michael;
	}

	public String[] getSatan()
	{
		return Satan;
	}

	public String[] getLucifer()
	{
		return Lucifer;
	}

	public String[] getMessiah()
	{
		return Messiah;
	}

	public String[] getUriel()
	{
		return Uriel;
	}

	public String[] getNidhogg()
	{
		return Nidhogg;
	}

	public String[] getAnanta()
	{
		return Ananta;
	}

	public String[] getAtavaka()
	{
		return Atavaka;
	}

	public String[] getMetatron()
	{
		return Metatron;
	}

	public void setStats(int[][] stats)
	{
		this.stats = stats;
	}


	public void setCharName(String[] charName)
	{
		this.charName = charName;
	}


	public void setCharType(String charType)
	{
		this.charType = charType;
	}


	public void setFoolArcana(String[] foolArcana)
	{
		this.foolArcana = foolArcana;
	}


	public void setMagicianArcana(String[] magicianArcana)
	{
		this.magicianArcana = magicianArcana;
	}


	public void setPriestessArcana(String[] priestessArcana)
	{
		this.priestessArcana = priestessArcana;
	}


	public void setEmpressArcana(String[] empressArcana)
	{
		this.empressArcana = empressArcana;
	}


	public void setEmperorArcana(String[] emperorArcana)
	{
		this.emperorArcana = emperorArcana;
	}


	public void setHeirophantArcana(String[] heirophantArcana)
	{
		this.heirophantArcana = heirophantArcana;
	}


	public void setLoversArcana(String[] loversArcana)
	{
		this.loversArcana = loversArcana;
	}


	public void setChariotArcana(String[] chariotArcana)
	{
		this.chariotArcana = chariotArcana;
	}


	public void setJusticeArcana(String[] justiceArcana)
	{
		this.justiceArcana = justiceArcana;
	}


	public void setHermitArcana(String[] hermitArcana)
	{
		this.hermitArcana = hermitArcana;
	}


	public void setFortuneArcana(String[] fortuneArcana)
	{
		this.fortuneArcana = fortuneArcana;
	}


	public void setStrengthArcana(String[] strengthArcana)
	{
		this.strengthArcana = strengthArcana;
	}


	public void setHangedmanArcana(String[] hangedmanArcana)
	{
		this.hangedmanArcana = hangedmanArcana;
	}


	public void setDeathArcana(String[] deathArcana)
	{
		this.deathArcana = deathArcana;
	}


	public void setTempranceArcana(String[] tempranceArcana)
	{
		this.tempranceArcana = tempranceArcana;
	}


	public void setDevilArcana(String[] devilArcana)
	{
		this.devilArcana = devilArcana;
	}


	public void setTowerArcana(String[] towerArcana)
	{
		this.towerArcana = towerArcana;
	}


	public void setStarArcana(String[] starArcana)
	{
		this.starArcana = starArcana;
	}


	public void setMoonArcana(String[] moonArcana)
	{
		this.moonArcana = moonArcana;
	}


	public void setSunArcana(String[] sunArcana)
	{
		this.sunArcana = sunArcana;
	}


	public void setJudgmentArcana(String[] judgmentArcana)
	{
		this.judgmentArcana = judgmentArcana;
	}


	public void setAeonArcana(String[] aeonArcana)
	{
		this.aeonArcana = aeonArcana;
	}


	public void setSelectedIndex(int selectedIndex)
	{
		this.selectedIndex = selectedIndex;
	}


	public void setPersonas(String[][] personas)
	{
		Personas = personas;
	}

	public void setOrpheus(String[] orpheus)
	{
		Orpheus = orpheus;
	}

	public void setSlime(String[] slime)
	{
		Slime = slime;
	}

	public void setLegion(String[] legion)
	{
		Legion = legion;
	}

	public void setOse(String[] ose)
	{
		Ose = ose;
	}

	public void setBlackFrost(String[] blackFrost)
	{
		BlackFrost = blackFrost;
	}

	public void setDecarabia(String[] decarabia)
	{
		Decarabia = decarabia;
	}

	public void setLoki(String[] loki)
	{
		Loki = loki;
	}

	public void setSusanoo(String[] susanoo)
	{
		Susanoo = susanoo;
	}

	public void setOrpheusTelos(String[] orpheusTelos)
	{
		OrpheusTelos = orpheusTelos;
	}

	public void setNekomat(String[] nekomat)
	{
		Nekomat = nekomat;
	}

	public void setJackFrost(String[] jackFrost)
	{
		JackFrost = jackFrost;
	}

	public void setPyroJack(String[] pyroJack)
	{
		PyroJack = pyroJack;
	}

	public void setHuaPo(String[] huaPo)
	{
		HuaPo = huaPo;
	}

	public void setSati(String[] sati)
	{
		Sati = sati;
	}

	public void setOrobas(String[] orobas)
	{
		Orobas = orobas;
	}

	public void setRangda(String[] rangda)
	{
		Rangda = rangda;
	}

	public void setSurt(String[] surt)
	{
		Surt = surt;
	}

	public void setApsaras(String[] apsaras)
	{
		Apsaras = apsaras;
	}

	public void setUnicorn(String[] unicorn)
	{
		Unicorn = unicorn;
	}

	public void setHighPixie(String[] highPixie)
	{
		HighPixie = highPixie;
	}

	public void setSarasvati(String[] sarasvati)
	{
		Sarasvati = sarasvati;
	}

	public void setGanga(String[] ganga)
	{
		Ganga = ganga;
	}

	public void setParvati(String[] parvati)
	{
		Parvati = parvati;
	}

	public void setKikurihime(String[] kikurihime)
	{
		Kikurihime = kikurihime;
	}

	public void setScathach(String[] scathach)
	{
		Scathach = scathach;
	}

	public void setLeananSidhe(String[] leananSidhe)
	{
		LeananSidhe = leananSidhe;
	}

	public void setYaksini(String[] yaksini)
	{
		Yaksini = yaksini;
	}

	public void setLaksmi(String[] laksmi)
	{
		Laksmi = laksmi;
	}

	public void setHariti(String[] hariti)
	{
		Hariti = hariti;
	}

	public void setGabriel(String[] gabriel)
	{
		Gabriel = gabriel;
	}

	public void setMotherHarlot(String[] motherHarlot)
	{
		MotherHarlot = motherHarlot;
	}

	public void setSkadi(String[] skadi)
	{
		Skadi = skadi;
	}

	public void setAlilat(String[] alilat)
	{
		Alilat = alilat;
	}

	public void setForneus(String[] forneus)
	{
		Forneus = forneus;
	}

	public void setOberon(String[] oberon)
	{
		Oberon = oberon;
	}

	public void setTakeMikazuchi(String[] takeMikazuchi)
	{
		TakeMikazuchi = takeMikazuchi;
	}

	public void setKingFrost(String[] kingFrost)
	{
		KingFrost = kingFrost;
	}

	public void setRajaNaga(String[] rajaNaga)
	{
		RajaNaga = rajaNaga;
	}

	public void setKingu(String[] kingu)
	{
		Kingu = kingu;
	}

	public void setBarong(String[] barong)
	{
		Barong = barong;
	}

	public void setOdin(String[] odin)
	{
		Odin = odin;
	}

	public void setOmoikane(String[] omoikane)
	{
		Omoikane = omoikane;
	}

	public void setBerith(String[] berith)
	{
		Berith = berith;
	}

	public void setShiisaa(String[] shiisaa)
	{
		Shiisaa = shiisaa;
	}

	public void setFlauros(String[] flauros)
	{
		Flauros = flauros;
	}

	public void setThoth(String[] thoth)
	{
		Thoth = thoth;
	}

	public void setHokutoSeikun(String[] hokutoSeikun)
	{
		HokutoSeikun = hokutoSeikun;
	}

	public void setDaisoujou(String[] daisoujou)
	{
		Daisoujou = daisoujou;
	}

	public void setKohryu(String[] kohryu)
	{
		Kohryu = kohryu;
	}

	public void setPixie(String[] pixie)
	{
		Pixie = pixie;
	}

	public void setAlp(String[] alp)
	{
		Alp = alp;
	}

	public void setNarcissus(String[] narcissus)
	{
		Narcissus = narcissus;
	}

	public void setQueenMab(String[] queenMab)
	{
		QueenMab = queenMab;
	}

	public void setSakiMitama(String[] sakiMitama)
	{
		SakiMitama = sakiMitama;
	}

	public void setTitania(String[] titania)
	{
		Titania = titania;
	}

	public void setRaphael(String[] raphael)
	{
		Raphael = raphael;
	}

	public void setCybele(String[] cybele)
	{
		Cybele = cybele;
	}

	public void setAraMitama(String[] araMitama)
	{
		AraMitama = araMitama;
	}

	public void setChimera(String[] chimera)
	{
		Chimera = chimera;
	}

	public void setZouchouten(String[] zouchouten)
	{
		Zouchouten = zouchouten;
	}

	public void setAres(String[] ares)
	{
		Ares = ares;
	}

	public void setOumitsunu(String[] oumitsunu)
	{
		Oumitsunu = oumitsunu;
	}

	public void setNataTaishi(String[] nataTaishi)
	{
		NataTaishi = nataTaishi;
	}

	public void setKoumokuten(String[] koumokuten)
	{
		Koumokuten = koumokuten;
	}

	public void setThor(String[] thor)
	{
		Thor = thor;
	}

	public void setAngel(String[] angel)
	{
		Angel = angel;
	}

	public void setArchangel(String[] archangel)
	{
		Archangel = archangel;
	}

	public void setPrinciplaity(String[] principlaity)
	{
		Principlaity = principlaity;
	}

	public void setPower(String[] power)
	{
		Power = power;
	}

	public void setVirtue(String[] virtue)
	{
		Virtue = virtue;
	}

	public void setDominion(String[] dominion)
	{
		Dominion = dominion;
	}

	public void setThrone(String[] throne)
	{
		Throne = throne;
	}

	public void setMelchizedek(String[] melchizedek)
	{
		Melchizedek = melchizedek;
	}

	public void setYomotsuShikome(String[] yomotsuShikome)
	{
		YomotsuShikome = yomotsuShikome;
	}

	public void setNaga(String[] naga)
	{
		Naga = naga;
	}

	public void setLamia(String[] lamia)
	{
		Lamia = lamia;
	}

	public void setMothman(String[] mothman)
	{
		Mothman = mothman;
	}

	public void setTaraka(String[] taraka)
	{
		Taraka = taraka;
	}

	public void setKuramaTengu(String[] kuramaTengu)
	{
		KuramaTengu = kuramaTengu;
	}

	public void setNebrios(String[] nebrios)
	{
		Nebrios = nebrios;
	}

	public void setKumbhanda(String[] kumbhanda)
	{
		Kumbhanda = kumbhanda;
	}

	public void setArahabaki(String[] arahabaki)
	{
		Arahabaki = arahabaki;
	}

	public void setFortuna(String[] fortuna)
	{
		Fortuna = fortuna;
	}

	public void setEmpus(String[] empus)
	{
		Empus = empus;
	}

	public void setKusiMitama(String[] kusiMitama)
	{
		KusiMitama = kusiMitama;
	}

	public void setClotho(String[] clotho)
	{
		Clotho = clotho;
	}

	public void setLachesis(String[] lachesis)
	{
		Lachesis = lachesis;
	}

	public void setAtropos(String[] atropos)
	{
		Atropos = atropos;
	}

	public void setNorn(String[] norn)
	{
		Norn = norn;
	}

	public void setCerberus(String[] cerberus)
	{
		Cerberus = cerberus;
	}

	public void setValkyrie(String[] valkyrie)
	{
		Valkyrie = valkyrie;
	}

	public void setRakshasa(String[] rakshasa)
	{
		Rakshasa = rakshasa;
	}

	public void setTitan(String[] titan)
	{
		Titan = titan;
	}

	public void setJikoukuten(String[] jikoukuten)
	{
		Jikoukuten = jikoukuten;
	}

	public void setHanuman(String[] hanuman)
	{
		Hanuman = hanuman;
	}

	public void setNarashima(String[] narashima)
	{
		Narashima = narashima;
	}

	public void setKali(String[] kali)
	{
		Kali = kali;
	}

	public void setSiegfried(String[] siegfried)
	{
		Siegfried = siegfried;
	}

	public void setInugami(String[] inugami)
	{
		Inugami = inugami;
	}

	public void setTakaMinakata(String[] takaMinakata)
	{
		TakaMinakata = takaMinakata;
	}

	public void setOrthrus(String[] orthrus)
	{
		Orthrus = orthrus;
	}

	public void setVasuki(String[] vasuki)
	{
		Vasuki = vasuki;
	}

	public void setUbelluris(String[] ubelluris)
	{
		Ubelluris = ubelluris;
	}

	public void setHecatoncheires(String[] hecatoncheires)
	{
		Hecatoncheires = hecatoncheires;
	}

	public void setHellBiker(String[] hellBiker)
	{
		HellBiker = hellBiker;
	}

	public void setAttis(String[] attis)
	{
		Attis = attis;
	}

	public void setGhoul(String[] ghoul)
	{
		Ghoul = ghoul;
	}

	public void setPaleRider(String[] paleRider)
	{
		PaleRider = paleRider;
	}

	public void setLoa(String[] loa)
	{
		Loa = loa;
	}

	public void setSamael(String[] samael)
	{
		Samael = samael;
	}

	public void setMot(String[] mot)
	{
		Mot = mot;
	}

	public void setAlice(String[] alice)
	{
		Alice = alice;
	}

	public void setThanatos(String[] thanatos)
	{
		Thanatos = thanatos;
	}

	public void setNigiMitama(String[] nigiMitama)
	{
		NigiMitama = nigiMitama;
	}

	public void setMithra(String[] mithra)
	{
		Mithra = mithra;
	}

	public void setGenbu(String[] genbu)
	{
		Genbu = genbu;
	}

	public void setSeiryuu(String[] seiryuu)
	{
		Seiryuu = seiryuu;
	}

	public void setOkuninushi(String[] okuninushi)
	{
		Okuninushi = okuninushi;
	}

	public void setSuzaku(String[] suzaku)
	{
		Suzaku = suzaku;
	}

	public void setByakko(String[] byakko)
	{
		Byakko = byakko;
	}

	public void setYurlungur(String[] yurlungur)
	{
		Yurlungur = yurlungur;
	}

	public void setLilim(String[] lilim)
	{
		Lilim = lilim;
	}

	public void setVetala(String[] vetala)
	{
		Vetala = vetala;
	}

	public void setIncubus(String[] incubus)
	{
		Incubus = incubus;
	}

	public void setSuccubus(String[] succubus)
	{
		Succubus = succubus;
	}

	public void setPazuzu(String[] pazuzu)
	{
		Pazuzu = pazuzu;
	}

	public void setLilith(String[] lilith)
	{
		Lilith = lilith;
	}

	public void setAbaddon(String[] abaddon)
	{
		Abaddon = abaddon;
	}

	public void setBeelzebub(String[] beelzebub)
	{
		Beelzebub = beelzebub;
	}

	public void setEligor(String[] eligor)
	{
		Eligor = eligor;
	}

	public void setChuChulainn(String[] chuChulainn)
	{
		ChuChulainn = chuChulainn;
	}

	public void setBishamonten(String[] bishamonten)
	{
		Bishamonten = bishamonten;
	}

	public void setSeitenTaisei(String[] seitenTaisei)
	{
		SeitenTaisei = seitenTaisei;
	}

	public void setMasakado(String[] masakado)
	{
		Masakado = masakado;
	}

	public void setMara(String[] mara)
	{
		Mara = mara;
	}

	public void setShiva(String[] shiva)
	{
		Shiva = shiva;
	}

	public void setChiYou(String[] chiYou)
	{
		ChiYou = chiYou;
	}

	public void setNandi(String[] nandi)
	{
		Nandi = nandi;
	}

	public void setKaiwan(String[] kaiwan)
	{
		Kaiwan = kaiwan;
	}

	public void setGanesha(String[] ganesha)
	{
		Ganesha = ganesha;
	}

	public void setGaruda(String[] garuda)
	{
		Garuda = garuda;
	}

	public void setKartikeya(String[] kartikeya)
	{
		Kartikeya = kartikeya;
	}

	public void setSaturnus(String[] saturnus)
	{
		Saturnus = saturnus;
	}

	public void setHelel(String[] helel)
	{
		Helel = helel;
	}

	public void setGurr(String[] gurr)
	{
		Gurr = gurr;
	}

	public void setYamatanoOrochi(String[] yamatanoOrochi)
	{
		YamatanoOrochi = yamatanoOrochi;
	}

	public void setGirimehkala(String[] girimehkala)
	{
		Girimehkala = girimehkala;
	}

	public void setDionysus(String[] dionysus)
	{
		Dionysus = dionysus;
	}

	public void setChernobog(String[] chernobog)
	{
		Chernobog = chernobog;
	}

	public void setSeth(String[] seth)
	{
		Seth = seth;
	}

	public void setBaalZebul(String[] baalZebul)
	{
		BaalZebul = baalZebul;
	}

	public void setSandalphon(String[] sandalphon)
	{
		Sandalphon = sandalphon;
	}

	public void setYatagarasu(String[] yatagarasu)
	{
		Yatagarasu = yatagarasu;
	}

	public void setQuetzalcoatl(String[] quetzalcoatl)
	{
		Quetzalcoatl = quetzalcoatl;
	}

	public void setJatayu(String[] jatayu)
	{
		Jatayu = jatayu;
	}

	public void setHorus(String[] horus)
	{
		Horus = horus;
	}

	public void setSparna(String[] sparna)
	{
		Sparna = sparna;
	}

	public void setVishnu(String[] vishnu)
	{
		Vishnu = vishnu;
	}

	public void setAsura(String[] asura)
	{
		Asura = asura;
	}

	public void setAnubis(String[] anubis)
	{
		Anubis = anubis;
	}

	public void setTrumpeter(String[] trumpeter)
	{
		Trumpeter = trumpeter;
	}

	public void setMichael(String[] michael)
	{
		Michael = michael;
	}

	public void setSatan(String[] satan)
	{
		Satan = satan;
	}

	public void setLucifer(String[] lucifer)
	{
		Lucifer = lucifer;
	}

	public void setMessiah(String[] messiah)
	{
		Messiah = messiah;
	}

	public void setUriel(String[] uriel)
	{
		Uriel = uriel;
	}

	public void setNidhogg(String[] nidhogg)
	{
		Nidhogg = nidhogg;
	}

	public void setAnanta(String[] ananta)
	{
		Ananta = ananta;
	}

	public void setAtavaka(String[] atavaka)
	{
		Atavaka = atavaka;
	}

	public void setMetatron(String[] metatron)
	{
		Metatron = metatron;
	}
		
}
