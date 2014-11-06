package ctec.p3compendium.controller;

import java.util.Set;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class CharScreen extends Activity
{

	private int [][] stats;
	private String[] charName;
	private String charType;
    private TextView personaNameShow;
    private TextView personaLevelShow;
    private TextView personaStShow;
    private TextView personaMaShow;
    private TextView personaEnShow;
    private TextView personaAgShow;
    private TextView personaLuShow;
    private TextView personaInheritShow;
    private TextView personaResistsShow;
    private TextView personaBlockShow;
    private TextView personaAbsorbsShow;
    private TextView personaReflectsShow;
    private TextView personaWeakShow;
    private TextView personaSkill1;
    private TextView personaSkill2;
    private TextView personaSkill3;
    private TextView personaSkill4;
    private TextView personaSkill5;
    private TextView personaSkill6;
    private TextView personaSkill7;
    private TextView personaCost1;
    private TextView personaCost2;
    private TextView personaCost3;
    private TextView personaCost4;
    private TextView personaCost5;
    private TextView personaCost6;
    private TextView personaCost7;
    private TextView personaEffect1;
    private TextView personaEffect2;
    private TextView personaEffect3;
    private TextView personaEffect4;
    private TextView personaEffect5;
    private TextView personaEffect6;
    private TextView personaEffect7;
    private TextView personaSkillLevel1;
    private TextView personaSkillLevel2;
    private TextView personaSkillLevel3;
    private TextView personaSkillLevel4;
    private TextView personaSkillLevel5;
    private TextView personaSkillLevel6;
    private TextView personaSkillLevel7;
    
	
	public int[][] getStats()
	{
		return stats;
	}
	public void setStats(int[][] stats)
	{
		this.stats = stats;
	}
	
	
	
	
	
	
	public TextView getpersonaName()
	{
		return personaNameShow;
	}
	public TextView getpersonaLevel()
	{
		return personaLevelShow;
	}
	public TextView getpersonaSt()
	{
		return personaStShow;
	}
	public TextView getpersonaMa()
	{
		return personaMaShow;
	}
	public TextView getpersonaEn()
	{
		return personaEnShow;
	}
	public TextView getpersonaAg()
	{
		return personaAgShow;
	}
	public TextView getpersonaLu()
	{
		return personaLuShow;
	}
	
	
	public TextView getpersonaInherit()
	{
		return personaInheritShow;
	}
	public TextView getpersonaResists()
	{
		return personaResistsShow;
	}
	public TextView getpersonaBlock()
	{
		return personaBlockShow;
	}
	public TextView getpersonaAbsorbs()
	{
		return personaAbsorbsShow;
	}
	public TextView getpersonaReflects()
	{
		return personaReflectsShow;
	}
	public TextView getpersonaWeak()
	{
		return personaWeakShow;
	}
	
	
	public TextView getpersonaSkill1()
	{
		return personaSkill1;
	}
	public TextView getpersonaSkill2()
	{
		return personaSkill2;
	}
	public TextView getpersonaSkill3()
	{
		return personaSkill3;
	}
	public TextView getpersonaSkill4()
	{
		return personaSkill4;
	}
	public TextView getpersonaSkill5()
	{
		return personaSkill5;
	}
	public TextView getpersonaSkill6()
	{
		return personaSkill6;
	}
	public TextView getpersonaSkill7()
	{
		return personaSkill7;
	}
	
	
	public TextView getpersonaCost1()
	{
		return personaCost1;
	}
	public TextView getpersonaCost2()
	{
		return personaCost2;
	}
	public TextView getpersonaCost3()
	{
		return personaCost3;
	}
	public TextView getpersonaCost4()
	{
		return personaCost4;
	}
	public TextView getpersonaCost5()
	{
		return personaCost5;
	}
	public TextView getpersonaCost6()
	{
		return personaCost6;
	}
	public TextView getpersonaCost7()
	{
		return personaCost7;
	}

	public TextView getpersonaEffect1()
	{
		return personaEffect1;
	}
	public TextView getpersonaEffect2()
	{
		return personaEffect2;
	}
	public TextView getpersonaEffect3()
	{
		return personaEffect3;
	}
	public TextView getpersonaEffect4()
	{
		return personaEffect4;
	}
	public TextView getpersonaEffect5()
	{
		return personaEffect5;
	}
	public TextView getpersonaEffect6()
	{
		return personaEffect6;
	}
	public TextView getpersonaEffect7()
	{
		return personaEffect7;
	}
	
	public TextView getpersonaSkillLevel1()
	{
		return personaSkillLevel1;
	}
	public TextView getpersonaSkillLevel2()
	{
		return personaSkillLevel2;
	}
	public TextView getpersonaSkillLevel3()
	{
		return personaSkillLevel3;
	}
	public TextView getpersonaSkillLevel4()
	{
		return personaSkillLevel4;
	}
	public TextView getpersonaSkillLevel5()
	{
		return personaSkillLevel5;
	}
	public TextView getpersonaSkillLevel6()
	{
		return personaSkillLevel6;
	}
	public TextView getpersonaSkillLevel7()
	{
		return personaSkillLevel7;
	}
	
//	 public Orpheus  (TextViewpersonaName,TextView personaLevel,TextView personaSt,TextView personaMa,TextView personaEn,TextView personaAg,TextView personaLu)
//	{
//		 this.personaNameShow= "Orpheus";
//		 this.personaAbsorbsShow = "";
//	}
//	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_char_screen);
		charType = getIntent().getExtras().getString("type");
		
		charName = new String[]
				
				{
					/**
					 * Fool
					 */
					"Orpheus",
					"Slime",
					"Legion",
					"Ose",
					"Black Frost",
					"Decarabia",
					"Loki",
					"Susano-o",
					"Orpheus Telos",
					/**
					 * Magician
					 */
					"Nekomata",
					"Jack Frost",
					"Pyro Jack",
					"Hua Po",
					"Sati",
					"Orobas",
					"Rangda",
					"Surt",
					/**
					 * Priestess
					 */
					"Apsaras",
					"Unicorn",
					"High Pixie",
					"Sarasvati",
					"Ganga",
					"Parvati",
					"Kikuri-hime",
					"Scathach",
					/**
					 * Empress
					 */
					"Leanan Sidhe",
					"Yaksini",
					"Laksmi",
					"Hariti",
					"Gabriel",
					"Mother Harlot",
					"Skadi",
					"Alilat",
					/**
					 * Emperor
					 */
					"Forneus",
					"Oberon",
					"Take-Mikazuchi",
					"King Frost",
					"Raja Naga",
					"Kingu",
					"Barong",
					"Odin",
					/**
					 * Heirophant
					 */
					"Omoikane",
					"Berith",
					"Shiisaa",
					"Flauros",
					"Thoth",
					"Hokuto Seikun",
					"Daisoujou",
					"Kohryu",
					/**
					 * Lovers
					 */
					"Pixie",
					"Alp",
					"Narcissus",
					"Queen Mab",
					"Saki Mitama",
					"Titania",
					"Raphael",
					"Cybele",
					/**
					 * Chariot
					 */
					"Ara Mitama",
					"Chimera",
					"Zouchouten",
					"Ares",
					"Oumitsunu",
					"Nata Taishi",
					"Koumokuten",
					"Thor",
					/**
					 * Justice
					 */
					"Amgel",
					"Archangel",
					"Principlaity",
					"Power",
					"Virtue",
					"Dominion",
					"Throne",
					"Melchizedek",
					/**
					 * Hermit
					 */
					"Yomotsu-Shikome",
					"Naga",
					"Lamia",
					"Mothman",
					"Taraka",
					"Kurama Tengu",
					"Nebrios",
					"Kumbhanda",
					"Arahabaki",
					/**
					 * Fortune
					 */
					"Fortuna",
					"Empus",
					"Kusi Mitama",
					"Clotho",
					"Lachesis",
					"Atropos",
					"Norn",
					/**
					 * Strength
					 */
					"Cerberus",
					"Valkyrie",
					"Rakshasa",
					"Titan",
					"Jikoukuten",
					"Hanuman",
					"Narashima",
					"Kali",
					"Siegfried",
					/**
					 * Hanged Man
					 */
					"Inugami",
					"Taka-Minakata",
					"Orthrus",
					"Vasuki",
					"Ubelluris",
					"Hecatoncheires",
					"Hell Biker",
					"Attis",
					/**
					 * Death
					 */
					"Ghoul",
					"Pale Rider",
					"Loa",
					"Samael",
					"Mot",
					"Alice",
					"Thanatos",
					/**
					 * Temperance
					 */
					"Nigi Mitama",
					"Mithra",
					"Genbu",
					"Seiryuu",
					"Okuninushi",
					"Suzaku",
					"Byakko",
					"Yurlungur",
					/**
					 * Devil
					 */
					"Lilim",
					"Vetala",
					"Incubus",
					"Succubus",
					"Pazuzu",
					"Lilith",
					"Abaddon",
					"Beelzebub",
					/**
					 * Tower
					 */
					"Eligor",
					"Chu Chulainn",
					"Bishamonten",
					"Seiten Taisei",
					"Masakado",
					"Mara",
					"Shiva",
					"Chi You",
					/**
					 * Star
					 */
					"Nandi",
					"Kaiwan",
					"Ganesha",
					"Garuda",
					"Kartikeya",
					"Saturnus",
					"Helel",
					/**
					 * Moon
					 */
					"Gurr",
					"Yamata-no-Orochi",
					"Girimehkala",
					"Dionysus",
					"Chernobog",
					"Seth",
					"Baal Zebul",
					"Sandalphon",
					/**
					 * Sun
					 */
					"Yatagarasu",
					"Quetzalcoatl",
					"Jatayu",
					"Horus",
					"Sparna",
					"Vishnu",
					"Asura",
					/**
					 * Judgment
					 */
					"Anubis",
					"Trumpeter",
					"Michael",
					"Satan",
					"Lucifer",
					"Messiah",
					/**
					 * Aeon
					 */
					"Uriel",
					"Nidhogg",
					"Ananta",
					"Atavaka",
					"Metatron",
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
					{87,61,65,57,61,56
						

					
					
					}
				};
		//* where we initialize all the text views, pics.
		

		
	}

	
	
		
}
