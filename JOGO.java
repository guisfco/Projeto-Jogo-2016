import java.util.Random;
import java.util.Scanner;
public class JOGO{
	public static void elf(){
		Random escolhe = new Random();		
		int menu, pontof, options, ataque, vidam = 100, vidap = 100;
		String nome;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Searching for information of Balthazar, in the way you find a wise elf, that gives \nyou the information that Balthazar is trying to devastate all 5 neighboring \npeoples, in order to control the entire region of Lumbridge, and that left only 2 \nkingdoms, and one of them was the Kingdom where your family lived.");
		teclado.nextLine();
		System.out.println("Amazed and scared of this information you seek have more clues about \nBalthazar and question the elf:");
		teclado.nextLine();
		System.out.println("You: — Where can I find Balthazar? He killed my dear mother before I \neven meet her");
		teclado.nextLine();
		System.out.println("Elf: — No one will never know where is Balthazar, he is a very powerful wizard and \nsmart, after all, all the people like you who are seeking revenge never came \naround him to try to get back at all the things he has done.");
		teclado.nextLine();
		System.out.println("You: — But Balthazar, in all the kingdoms that spent destroying and winning might have \nleft any clues along the way. Don’t you know a clue that can help me find \nhim?");
		teclado.nextLine();
		System.out.println("Elf: — The only thing I know about Balthazar is that he was born in the Kingdom of \nMergonia which is not far away and that was seen in the realm of Lorien but \nyou need a lot of luck to find the evil Balthazar.");
		teclado.nextLine();
		System.out.println("You: — How do you know all these things about him?");
		teclado.nextLine();
		System.out.println("Elf: — I know all these things, because I wanted to get even just like you that damn \nwizard who cursed my whole life killing my whole family!");
		teclado.nextLine();
		System.out.println("Seeking more clues about Balthazar, which kingdom do you want to go to: \n1. Mergonia \n2. Lorien");
		options=teclado.nextInt();	
		if(options==1){
			elfpart2();
		}else{
			teclado.nextLine();
			System.out.println("You go to the North to reach the unknown Kingdom until then, and are forced \nto walk through a forest. It's almost evening when an \nimmense hunger starts to take care of your body.");
			teclado.nextLine();
			vidap = vidap-25;
			System.out.println("You lose 25HP\nHP: " +vidap+ "/100\n");
			teclado.nextLine();
			System.out.println("You need to get food. What do you want to do? \n1. Proceed your path \n2. Look for food to survive");
			options=teclado.nextInt();
			if(options==1){
				teclado.nextLine();
				System.out.println("In the evening you despair because legends that came to their \nancestors say that this forest was taken by demons to a century. The \nlegend says that five men, servants of a great King, were protecting the \nbastard who planned the death of his father to become his \nsuccessor, because the king never got an heir. The bastard kills them, as \nthese servants knew of his plan. They say the five demons wander this \nforest, looking for victims.");
				teclado.nextLine();
				System.out.println("You're walking for more than 2 hours, and increase hunger. You are getting \nweaker and weaker.");
				teclado.nextLine();
				vidap = vidap-25;
				System.out.println("You lose 25HP\nHP: " +vidap+ "/100\n");
				teclado.nextLine();
				System.out.println("You hear branches breaking, and suspect that the demons have found you. You \nchoose...\n1. To know where were the noises\n2. To hide in a near house");
				options=teclado.nextInt();
				if(options==1){
					System.out.println("You go to the left, and see the demon, grab your sword and trie to stab \nhim. You are too weak because of hunger, and the devil has enough time to \nkill you.");
					teclado.nextLine();
					System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
					teclado.nextLine();
				}else{
					teclado.nextLine();
					System.out.println("You enter the house and don't see anyone, looks like it was abandoned \nfor months. Looking for food, feeds, and renews your life.");
					teclado.nextLine();
					vidap=100;
					System.out.println("For obvious reasons you decide to spend the night in this house and proceed \nthe path in next morning.");
					teclado.nextLine();
					System.out.println("Dawns, you take all the food supplies of the House and you proceed the path \nto the unknown reign");
					teclado.nextLine();
					Lorieningles();
				}
			}else{
				teclado.nextLine();
				System.out.println("You are looking for fruit trees, is two, but were strangers, one \nof Physalis and another of Holly. You choose…\n1. Holly\n2. Physalis");
				options=teclado.nextInt();
				if(options==1){
					teclado.nextLine();
					System.out.println("You eat the Holly fruit and begins to feel bad, and soon after discovers that it \nwas poisonous, and ends up dying.");
					teclado.nextLine();
					System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
					teclado.nextLine();
				}
				else{
					teclado.nextLine();
					System.out.println("You eat the physalis fruit and renew your life.");
					teclado.nextLine();
					vidap=100;
					System.out.println("Now is night! You decide …\n1. Spend the night in the forest \n2. proceed your path to find Balthazar ");
					options=teclado.nextInt();
					if(options==1){
						teclado.nextLine();
						System.out.println("You decide to sleep and continue your journey in the morning, you \nwere very tired, after all I was walking for hours. ");
						teclado.nextLine();
						System.out.println("It's the middle of the night and you hear steps coming from your right. When you \nare going to raise is stabbed with a sword without even see your enemy.");
						teclado.nextLine();
						System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
						teclado.nextLine();
					}else{
						teclado.nextLine();
						System.out.println("You decide to continue your path, after hours of walking");
						options=teclado.nextInt();
						Lorieningles();
					}				
				}				
			}
		}
	}
	public static void elfpart2(){
		Random escolhe = new Random();		
		int menu, pontof, options, ataque, vidam = 100, vidap = 100;
		String nome;
		Scanner teclado= new Scanner(System.in);
		System.out.println("The elf ask you if he can go with you in your journey searching for Balthazar. \n1. You accept the help of the elf to go together search for Balthazar. \2. You deny the company of the elf and follow your way searching for clues about Balthazar.");
		options=teclado.nextInt();
		if(options==1){
			System.out.println("On the way to Mergonia you and the elf can see servants of Balthazar on the \nway, immediately you hide, but the enemies look elf running to try to escape. \n1. You run to the elf to try to help him.  \n2. You did not help the elf because it \nmay run the risk of dying with him.");
			options=teclado.nextInt();
			if(options==1){
				teclado.nextLine();
				System.out.println("You can get to the elf, before the enemies get him.");
				teclado.nextLine();
				System.out.println("Get ready to battle against the enemies with the help of the elf to continue your \nway to the Kingdom.");
				teclado.nextLine();
				do {
					pontof= escolhe.nextInt(4)+1;
					System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
					ataque = teclado.nextInt();
					if (ataque == pontof) {
						vidam = vidam-50;
						System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
					} else {
						vidap = vidap-25;
						System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
					}
				} while (vidap > 0 && vidam > 0);
				if(vidap > 0){
					System.out.println("You defeat the enemy and recovered your life!\n");
					vidap = 100;
					vidam = 100;
					teclado.nextLine();
					System.out.println("Arriving in Mergonia with the Elf you find a big castle too dark and terrifying.");
					teclado.nextLine();
					System.out.println("You and the Elf approach the mysterious dark castle and knocking on the door. \nA very large beard and white hair opens the door and says:");
					teclado.nextLine();
					System.out.println("Sir: — Who are you, what are you doing here?");
					teclado.nextLine();
					System.out.println("Elf: — We are looking for clues about the damn Wizard Balthazar. Do you know \nwhere could he be? He left this kingdom to devastate the  \nentire region of Lumbridge.");
					teclado.nextLine();
					System.out.println("Sir: — Balthazar is very far from here, get out of here and go back to your \nhome. ");
					teclado.nextLine();
					System.out.println("Replied the Sir grossly closing the door of the Castle.");
					teclado.nextLine();
					System.out.println("You and the Elf deviate a little from there, but you know there is something \nstrange in this castle for the Sir spoke about Balthazar with uncertainties and \nfear of you here.");
					teclado.nextLine();
					System.out.println("Immediately you go to the Castle funds surreptitiously without the security of the \ncastle see you and can quickly enter hiding them, through the back door.");
					teclado.nextLine();
					System.out.println("When entering the castle the Elf warns you that you found something ...");
					teclado.nextLine();
					System.out.println("You: — what is it?");
					teclado.nextLine();
					System.out.println("Elf: — look, it's a portrait of Balthazar with someone and here \nis an inscription saying:");
					teclado.nextLine();
					System.out.println("'' To my dear brother. Signed: > > Arthur < < ''");
					teclado.nextLine();
					System.out.println("You, in a state of shock look again to that image and seems to not believe \nwhat you see, because you could never imagine that King Arthur was the \nbrother of Balthazar.");
					teclado.nextLine();
					System.out.println("Quickly you speak to the Elf:");
					teclado.nextLine();
					System.out.println("You: — We're at Balthazar’s castle, I know where we can find him, lets go to \nArthur’s kingdom, in Kandarim.");
					teclado.nextLine();
					System.out.println("Elf: — We have to get out of this castle so before them pick-up us.");
					teclado.nextLine();
					System.out.println("1.Find more clues about Balthazar in the Castle, in danger if seen by someone.\n 2. Try to escape the Castle as soon as possible with the Elf and go \nafter Balthazar in Kandarim.");
					options=teclado.nextInt();
					if(options==1){
						teclado.nextLine();
						System.out.println("Trying to find more clues in the castle of Balthazar, you are seen by the man wh\no closed the door of the castle on your face and you don't have a chance \nagainst the security of the Castle, who are in majority and you die with the Elf trying \nto escape!");
						teclado.nextLine();
						System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
						teclado.nextLine();
					}else{
						teclado.nextLine();
						System.out.println("You and the Elf, can leave the castle the same way you came in and finally feel \nyou are very close to finding Balthazar when you arrive in Kandarim.");
						teclado.nextLine();
						System.out.println("Arriving in Kandarim, you drive directly to King Arthur's Castle. Inside children's screams are heard in hum loud and clear.");
						teclado.nextLine();
						System.out.println("The size of the Castle ends up proving to be difficult to find the source of the \ncries. You rundesperately, her family seems to be in danger and needs your \nhelp.");
						teclado.nextLine();
						System.out.println("You find out where the sound is coming from and arrive at point to \nprevent a death, a minute after would be too late.");
						teclado.nextLine();
						System.out.println("You: — Stop now Balthazar, don't be chicken fight me and let my son down now.");
						teclado.nextLine();
						System.out.println("Balthazar: —I saw you in my visions, you were behind me trying to ruin my \nplans, I went ahead and I arrived first.");
						teclado.nextLine();
						System.out.println("You: —Your killer, let them go, I am the one you should fear.Get out of \nhere, this fight is between me and him.");
						teclado.nextLine();
						System.out.println("Balthazar:—Killer for me is praise, many lives I took and I liked it.");
						teclado.nextLine();
						System.out.println("You:— I'm going to avenge the death of my mother and you will be dead.");
						teclado.nextLine();
						System.out.println("Balthazar: — You can try.");
						teclado.nextLine();
						do {
							pontof= escolhe.nextInt(4)+1;
							System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
							ataque = teclado.nextInt();
							if (ataque == pontof) {
								vidam = vidam-50;
								System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
							} else {
								vidap = vidap-25;
								System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
							}
						} while (vidap > 0 && vidam > 0);
						if(vidap > 0){
							vidap = 100;
							vidam = 100;
							teclado.nextLine();
							System.out.println("You: — Now you will die and my revenge will be made. What are his last words.");
							teclado.nextLine();
							System.out.println("Balthazar: — I want you to burn in hell.");
							teclado.nextLine();
							System.out.println("You: — Wait for me then.");
							teclado.nextLine();
							System.out.println("Something happens with Balthazar and he starts making strange movements.");
							teclado.nextLine();
							System.out.println("Balthazar: — Please don't kill me, finally managed to break free. Let me live and \nwill show you the truth.");
							teclado.nextLine();
							System.out.println("1. Finish this once and for all. \n2. Show mercy.");
							options=teclado.nextInt();
							if(options==1){
								teclado.nextLine();
								System.out.println("With the mother’s sword wielded, you throw the sword \nhitting the chest of Balthazar and killing him.");
								teclado.nextLine();
								System.out.println("With the problems solved, you return to the Kingdom \nof Kandarim and informs the King that Balthazar was \ndead and wouldn't cause problems. After that, with the kingdoms safe, you go \nback to your house with your family, and begins to build a new life.");
							}else{
								teclado.nextLine();
								System.out.println("Without you least expect it, you and Balthazar are face to face, and slowly it \nstarts to approach:");
								teclado.nextLine();
								System.out.println("Balthazar: — Young man, must not rely completely on a person, that no matter \nhow seem good, can cause surprises.");
								teclado.nextLine();
								System.out.println("… when approaching, with his magic he shows visions of the past, where you \nsee the life of Balthazar…");
								teclado.nextLine();
								System.out.println("(Now you see the past of Balthazar)");
								teclado.nextLine();
								System.out.println("... 1367, things were a little different, the kingdoms were intact and all \nliving in great peace.");
								teclado.nextLine();
								System.out.println("Artur: — Balth. What you want to be when you grow up? I want to be the most \npowerful man ever.");
								teclado.nextLine();
								System.out.println("Balthazar: — I don't know, I'd like to one day be a great warrior and fight for our \npeople when they need ...");
								teclado.nextLine();
								System.out.println("(After a few years pass in a measlysecondsin your reality, the kingdoms were \nno longer like before, but it was still a peaceful place to live)");
								teclado.nextLine();
								System.out.println("Artur: — Brother, I know who I'm going to spend the rest of my life, and I'm \ngoing to marry her, what do you think?");
								teclado.nextLine();
								System.out.println("Balthazar: — Don't you think a little early? You haven't even inherited the throne \nof our father!");
								teclado.nextLine();
								System.out.println("Artur: — There's no problem with that, we will be crowned.");
								teclado.nextLine();
								System.out.println("(The years go by, Artur had become King of Kandarim, however, at your \nwedding happens something terrible. His wife abandons him in the middle \nof the aisle to live with a simple peasant, making Artur spent shame in front \nof all his people, and with that, Artur becomes a man cold)");
								teclado.nextLine();
								System.out.println("Artur: — Balthazar! Join the troops, we will master all kingdoms as a way to \nshow these people that I am a filthy, the most powerful man in the \nworld, and that should never have laughed at me.");
								teclado.nextLine();
								System.out.println("Balthazar: — Artur, stop it! You are blind with rage by his \nwife abandoned him, andour people has absolutely nothing to \ndo with your poor choice.");
								teclado.nextLine();
								System.out.println("Artur: — You don't dare disrespect me, I have what it takes to kill \neveryone, and especially your family, then do what I impose \nor you and your family will suffer!");
								teclado.nextLine();
								System.out.println("(No choice, Balthazar with your magic help Artur to dominate the \nkingdoms, causing many deaths and destruction...)");
								teclado.nextLine();
								System.out.println("In an instant you wake up to the reality, but you don't know if Balthazar showed \nthe true, then decide: \n1. Believe Balthazar and don’t kill him \n2. Doesn't listen Balthazar and avenge the death of your mother");
								options=teclado.nextInt();
								if(options==1){
									teclado.nextLine();
									System.out.println("You: — I believe in you, where is he?");
									teclado.nextLine();
									System.out.println("Balthazar: — He's in the square, all the kingdoms were conquered, only this. \nYou need to go fast, this Kingdom live all those who mocked him when he \nwas left at the altar.");
									teclado.nextLine();
									System.out.println("You arrive in the square and listen Artur preaching.");
									teclado.nextLine();
									System.out.println("Artur: — a few years ago you humiliated me, laughed and did I feel a void \ninside me, my own people. When I became King decided to conquer all the \nkingdoms and show everyone what I can do. Misthalin was reduced to ashes \nin Lorien released a plague that ended with two-thirds of the population. Now it's \nyour turn surrender and let themselves be enslaved or fight and die.");
									teclado.nextLine();
									System.out.println("You: — I'm not going to let that happen. You killed my mother and used \nBalthazar as a puppet. Go down and fight like a man, if you're a. Coward.");
									teclado.nextLine();
									System.out.println("Artur: — Balthazar told me that you were trying to spoil our plans, you will not \nbe able to defeat me");
									teclado.nextLine();
									System.out.println("You: — You helped me. I thought it was a good King, but I was wrong");
									teclado.nextLine();
									System.out.println("Artur: — I am your father, your mother and I had a story, but she left me at the \naltar and left me for that peasant you call dad.");
									teclado.nextLine();
									System.out.println("You: — tell me the truth, what happened to my mother? It was you, wasn't it?");
									teclado.nextLine();
									System.out.println("Artur: — I had to do it, she was keeping me from performing the conquest of \nMisthalin, no other solution except kill her. I suffered as much as you, forgive \nme son");
									teclado.nextLine();
									System.out.println("You: — You're not my father, you are a monster. Die.");
									teclado.nextLine();
									do {
										pontof= escolhe.nextInt(4)+1;
										System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
										ataque = teclado.nextInt();
										if (ataque == pontof) {
											vidam = vidam-50;
											System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
										} else {
											vidap = vidap-25;
											System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
										}
									} while (vidap > 0 && vidam > 0);
									if(vidap > 0){
										System.out.println("You defeat Artur");
										vidap = 100;
										vidam = 100;
										teclado.nextLine();
										System.out.println("When you thought I was defeated, you turn your back for a moment. Arthur gets \nup and part to stab him in the back, but his friend Elf enters the front and ends \nup being shot.");
										teclado.nextLine();
										System.out.println("Elf: — Avenge my family ...");
										teclado.nextLine();
										System.out.println("You: — You killed him.");
										teclado.nextLine();
										System.out.println("Arthur: — I'm still standing, come.");
										teclado.nextLine();
										do {
											pontof= escolhe.nextInt(4)+1;
											System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
											ataque = teclado.nextInt();
											if (ataque == pontof) {
												vidam = vidam-50;
												System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
											} else {
												vidap = vidap-25;
												System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
											}
										} while (vidap > 0 && vidam > 0);
										if(vidap > 0){
											vidap = 100;
											vidam = 100;
											teclado.nextLine();
											System.out.println("Artur: — Get it over with.");
											teclado.nextLine();
											System.out.println("You: — I can't. I'm not that kind of person.");
											teclado.nextLine();
											System.out.println("Artur: — You are not my son, you're weak.");
											teclado.nextLine();
											System.out.println("Balthazar: — I do. That's because you have made me kill all those poor \ninnocent people.");
											teclado.nextLine();
											System.out.println("Balthazar cut the head of Arthur who goes rolling and your crown falls.");
											teclado.nextLine();
											System.out.println("Balthazar: — You are the rightful heir, accepted that Crown and rule as Arthur \nnever did.");
											teclado.nextLine();
											System.out.println("1. Accept \n2. Don't accept");
											options=teclado.nextInt();
											if(options==1){
												teclado.nextLine();
												System.out.println("You: — Will be a honor.");
												teclado.nextLine();
												System.out.println("Balthazar: — long live the new King");
												teclado.nextLine();
												crown();
											}else{
												teclado.nextLine();
												System.out.println("You don't accept to be King and passes the crown to the next person in the line \nof succession, Balthazar.");
												teclado.nextLine();
												System.out.println("You: — Take Balthazar, you deserve all this time that suffered at the hands of \nhis brother. Long live the new King.");
												crown();
											}
										}else{
											teclado.nextLine();
											System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
											teclado.nextLine();
											vidap = 100;
											vidam = 100;
										}
									}else{
										teclado.nextLine();
										System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
										teclado.nextLine();
										vidap = 100;
										vidam = 100;
									}
								}else{
									teclado.nextLine();
									System.out.println("With the mother’s sword wielded, you throw the sword \nhitting the chest of Balthazar and killing him.");
									teclado.nextLine();
									System.out.println("With the problems solved, you return to the Kingdom \nof Kandarim and informs the King that Balthazar was \ndead and wouldn't cause problems. After that, with the kingdoms safe, you go \nback to your house with your family, and begins to build a new life.");
									teclado.nextLine();
								}
							}
						}else{
							teclado.nextLine();
							System.out.println("Balthazar: — You failed and now it will be your end.");
							teclado.nextLine();
							System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
							teclado.nextLine();
							vidap = 100;
							vidam = 100;
						}
					}
				}else{
					teclado.nextLine();
					System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
					teclado.nextLine();
					vidap = 100;
					vidam = 100;					
				}
			}else{
				teclado.nextLine();
				System.out.println("Following your way alone and abandoning the elf you are surprised by \nenemies in the back and end up being killed by an arrow in the head without \neven being able to defend.");
				teclado.nextLine();
				System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
				teclado.nextLine();
			}
		}else{
			teclado.nextLine();
			System.out.println("Following your way alone you are surprised by enemies in the back and end \nup being killed by an arrow in the head without even being able to defend.");
			teclado.nextLine();
			System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
			teclado.nextLine();
		}
	}
	public static void Lorieningles(){
		Random escolhe = new Random();		
		int menu, pontof, options, ataque, vidam = 100, vidap = 100;
		String nome;
		Scanner teclado= new Scanner(System.in);
		System.out.println("You see a man leaning against a tree, he appear very sick. You decide ... \n1. Proceed your path for reign \n2. Help the sir");
		options=teclado.nextInt();
		if(options==1){
			teclado.nextLine();
			System.out.println("Taken by rage you decide to proceed the path to get faster to the \nKingdom and see if you have news of Balthazar. You walk for a few \nhours, when suddenly you see the great unknown kingdom.");
			teclado.nextLine();
			System.out.println("Getting there you don't see anybody. It seems that everything was \nabandoned. You examine the place. Enter in some houses, and \nfeels a strong smell. They have left no traces of anything. No sign of people.");
			teclado.nextLine();
			System.out.println("After hours analyzing, listen some screams emanating from the Church. Get out \nthere and find a sir.");
			teclado.nextLine();
			System.out.println("You: — Hi, I'm looking for Balthazar. When I arrived here I couldn't find anyone, \nit seems that this Kingdom was uninhabited. What happened?");
			teclado.nextLine();
			System.out.println("Sir: — you don't know what happened? Our Kingdom was taken by a plague \nthat killed more than 2/3 of the population here. We're in \ntrouble, each day more deaths and more contaminated. There is no cure.");
			teclado.nextLine();
			System.out.println("You: — My God! Where are the people infected? It may be that the \nbodies are infecting more people. ");
			teclado.nextLine();
			System.out.println("Sir: — The infected are in the basement of the Church. You see that pile \nof bodies in your right? Just left me and a few people.");
			teclado.nextLine();
			System.out.println("You: — you have to burn the bodies, before they contaminate more people. No \none can have contact with contaminated people. ");
			teclado.nextLine();
			System.out.println("What do you want to do? \n1. Help the sir to burn the bodies\n2. Doesn’t help and ask about Balthazar");
			options=teclado.nextInt();
			if(options==1){
				teclado.nextLine();
				System.out.println("You get pity of the sir, and starts to help. First drag the \nbodies, and the stacks in a place away from the Church, where they \nwere infected. After that, you and you take a torch and set fires on the \nbodies. The fire spreads and ends up hitting a House, \nwhich was also a little away from the city. You control the fire, and the \nsir thanks.");
				teclado.nextLine();
				System.out.println("You start to feel bad. The sir begins to drift away from you.");
				teclado.nextLine();
				System.out.println("Sir: — You got the plague, my God, you need to go to the basement of the \nChurch, before it's too late. If you stay you can contaminate the survivors.");
				teclado.nextLine();
				System.out.println("You panic, but would rather save some lives. You drive to the place along with \nthe infected, and only accept death.");
				teclado.nextLine();
				System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
				teclado.nextLine();
			}else{
				teclado.nextLine();
				System.out.println("You refuse to help the sir, and asks:");
				teclado.nextLine();
				System.out.println("You: — I wonder if you have news of Balthazar.");
				teclado.nextLine();
				System.out.println("Sir: — I know Balthazar was born in the Kingdom of Mergonia, maybe \nyou find clues there.");
				teclado.nextLine();
				System.out.println("You: — Ok, thanks.");
				teclado.nextLine();
				System.out.println("You follow your way to the kingdom of Mergonia. On the way you find the elf again");
				teclado.nextLine();
				elfpart2();
			}		
		}else{
			teclado.nextLine();
			System.out.println("You take pity on the poor sir who was helpless in the midst of a dangerous \nforest and ask what is his problem ...");
			teclado.nextLine();
			System.out.println("You: — excuse me, I see you're very sick, and I'd like to help you. What are \nyou feeling?");
			teclado.nextLine();
			System.out.println("Sir: — Of course my son ... I'm with chills, fever, headaches, and I'm coughing \nup blood. I think I have a few hours. I am very hungry. Look ...");
			teclado.nextLine();
			System.out.println("He shows a pool of blood beside him.");
			teclado.nextLine();
			System.out.println("You: — Take some of my food. Follow into the realm of Lorien, stranger in my \nland. We will seek shelter for you. ");
			teclado.nextLine();
			System.out.println("You wait the sir to finish eating, and proceed your path.");
			teclado.nextLine();
			System.out.println("After a few hours of walking, you start to feel bad. You have the same \nsymptoms of the sir. You can see the Kingdom, and some soldiers. They soon \nrealize that the sir and you are also sick. They pretend to talk, and hit his \nheart, without you having any chance.");
			teclado.nextLine();
			System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
			teclado.nextLine();
		}		
	}
	public static void demon(){
		Random escolhe = new Random();		
		int menu, pontof, options, ataque, vidam = 100, vidap = 100;
		String nome;
		Scanner teclado= new Scanner(System.in);
		System.out.println("You get in cell block, where some people are trapped and walks down the Hall, \nhoping to find them.");
		teclado.nextLine();
		System.out.println("Person1: — Have a slave out of his cell, turn on the siren and call the Red \nCommander.");
		teclado.nextLine();
		System.out.println("It's time to run again. At a glance you think view the image on your \nfamily in a holding cell just three walls and, in order to make sure that it wasn't \nthem.");
		teclado.nextLine();
		System.out.println("Henrique: — Daddy, you came to save us.");
	}
	public static void crown(){
		Random escolhe = new Random();		
		int menu, pontof, options, ataque, vidam = 100, vidap = 100;
		String nome;
		Scanner teclado= new Scanner(System.in);
		System.out.println("All people speak as a voice only and clamor for new King");
		teclado.nextLine();
		System.out.println("Elf: — Did you get");
		teclado.nextLine();
		System.out.println("You: — Elf you're alive. Balthazar save him, I know that you are able");
		teclado.nextLine();
		System.out.println("Balthazar: — I can only fix it by giving a little of the life of another person for him.");
		teclado.nextLine();
		System.out.println("You: — Do it with me.");
		teclado.nextLine();
		System.out.println("Balthazar casts his spell and the Elf heal instantly.");
		teclado.nextLine();
		System.out.println("You: — My friend, you are back");
		teclado.nextLine();
		System.out.println("Elf: — Thank you.");
		teclado.nextLine();
		System.out.println("Later that same day, soon after the coronation ceremony for you and your family begin to build a new world");
		teclado.nextLine();	
	}
	public static void elfo(){
		Random escolhe = new Random();		
		int menu, pontof, options, ataque, vidam = 100, vidap = 100;
		String nome;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Buscando informações de Balthazar, no caminho você encontra um sábio elfo, que lhe dá a \ninformação de que Balthazar está tentando devastar todos os 5 povos vizinhos, \npara poder controlar toda a região de Sonserina, e que restou apenas 2 povos,\ne um deles era o reino onde sua família vivia.");
		teclado.nextLine();
		System.out.println("Espantado e com medo dessas informações você procura ter mais pistas sobre \nbalthazar e pergunta ao elfo: ");
		teclado.nextLine();
		System.out.println("Você: — Onde posso encontrar Balthazar? ele matou minha querida mãe antes \nmesmo de eu conhcê-la.");
		teclado.nextLine();
		System.out.println("Elfo: — Ninguém nunca saberá onde balthazar está,ele é um mago muito poderoso \ne esperto afinal, todas as pessoas como você que estão em busca de vingança\nnunca chagaram se quer perto dele para tentar se vingar de todas as coisas que ele já fez!  ");
		teclado.nextLine();
		System.out.println("Você: — Mas balthazar,em todos os reinos que passou destruindo e conquistando \ndeve ter deixado alguma pista pelo caminho. \nVocê não sabe de nenhuma pista que pode me ajudar a encontrá-lo?");
		teclado.nextLine();
		System.out.println("Elfo: — A unica coisa que sei a respeito de balthazar é que ele nasceu no \nReino de Mergonia que nao fica muito longe daqui\ne que  foi visto no reino de Lorien mas você precisará de muita sorte para encontrar o maligno Balthazar.");
		teclado.nextLine();
		System.out.println("Você: — Mas e como você sabe todas essas coisas sobre ele? ");
		teclado.nextLine();
		System.out.println("Elfo: — Eu sei todas essas coisas, pois já quis me vingar assim como você \ntambém daquele maldito mago que amaldiçoou toda a minha vida matando minha familia inteira!");
		teclado.nextLine();
		System.out.println("Buscando mais pistas sobre Balthazar, para qual reino você deseja ir: \n1. Mergonia \n2. Lorien");
		options=teclado.nextInt();
		if(options==1){
			elfoparte2();
		}
		else{
			System.out.println("Você segue para o Norte a fim de chegar ao desconhecido reino até então, e \nse vê obrigado a atravessar uma floresta. Já está quase anoitecendo quando \numa imensa fome começa tomar conta de seu corpo.");
			teclado.nextLine();
			vidap = vidap-25;
			System.out.println("Você perdeu 25HP\nHP: " +vidap+ "/100\n");
			teclado.nextLine();
			System.out.println("Você precisar conseguir comida. O que deseja fazer?\n1. Seguir seu caminho\n2. Procurar comida para sobreviver");
			options = teclado.nextInt();
			if (options == 1) {
				System.out.println("Acaba de anoitecer e você se vê em desespero, pois lendas que chegaram a \nseus ancestrais dizem que esta floresta foi tomada por demônios à um \nséculo. A lenda diz que cinco homens, servos de um grande rei, estavam \nprotegendo o bastardo que planejava a morte de seu pai para se tornar seu \nsucessor, já que este não conseguiu outro herdeiro. O bastardo os mata, pois \nestes servos sabiam de seu plano. Dizem que os cinco demônios vagam por \nesta floresta, procurando vítimas.");
				teclado.nextLine();
				System.out.println("Você já está andando a mais de duas horas, e a fome só aumenta. Você está \nficando cada vez mais fraco.");
				teclado.nextLine();
				vidap = vidap-25;
				System.out.println("Você perdeu 25HP\nHP: " +vidap+ "/100\n");
				teclado.nextLine();
				System.out.println("Você escuta galhos quebrando, e desconfia que os demônios tenham o \nachado. Você escolhe...\n1. Certificar-se de onde vinham os barulhos\n2. Esconder-se em uma casa próxima");
				options = teclado.nextInt();
				if (options == 1) {
					teclado.nextLine();	
					System.out.println("Você vai para à esquerda, e vê o tal demônio, pega a sua espada e tenta \napunhalá-lo. Você está fraco demais por causa da fome, e acaba caindo e o \ndemônio tem tempo suficiente para matar você.");
					teclado.nextLine();
					System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
					teclado.nextLine();			
				} else {
					System.out.println("Você entra na casa e não vê ninguém, parece que foi abandonada meses atrás. \nProcura comida, se alimenta e renova sua vida.");
					vidap = 100;
					teclado.nextLine();
					System.out.println("Por motivos óbvios você decide passar a noite nesta casa e seguir o caminho \nna manhã seguinte. ");
					teclado.nextLine();
					System.out.println("Amanhece, você pega todo o estoque de comida da casa e você segue o \ncaminho para o reino desconhecido.");
					teclado.nextLine();
					Lorien();
				}
			} else {
				System.out.println("Você procura árvores frutíferas, encontra duas, porém eram estranhas, uma de \nPhysalis e outra de azevinho. \nVocê escolhe: \n1. Azevinho;\n2. Physalis;");
				options = teclado.nextInt();
				if (options == 1) {
					teclado.nextLine();	
					System.out.println("Você come a fruta de azevinho e começa a se sentir mal, e logo depois descobre que ela era venenosa, e acaba morrendo.");
					teclado.nextLine();	
					System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
					teclado.nextLine();	
				} else {
					teclado.nextLine();
					System.out.println("Você come a fruta physalis, e renova a sua vida.");
					vidap = 100;
					teclado.nextLine();
					System.out.println("Já havia anoitecido... Você decide...\n1. Passar a noite na floresta, a fim de descansar;\n2. Seguir caminho, visando encontrar Balthazar;");
					options = teclado.nextInt();
					if (options == 1 ) {
						teclado.nextLine();
						System.out.println("Você decide dormir e continuar sua jornada pela manhã, \njá que você estava muito cansado, afinal estava caminhando há horas. \nÉ madrugada e você escuta passos vindos da sua direita. Quando vai se \nlevantar é apunhalado com uma espada, sem que nem visse o seu inimigo.");
						teclado.nextLine();
						System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
						teclado.nextLine();
						
					} else {
						teclado.nextLine();
						System.out.println("Você decide continuar seu caminho, depois de horas de caminhada.");
						teclado.nextLine();
						Lorien();
					}
				}												
			}
		}
	}
	public static void elfoparte2(){
		Random escolhe = new Random();		
		int menu, pontof, options, ataque, vidam = 100, vidap = 100;
		String nome;
		Scanner teclado= new Scanner(System.in);
		System.out.println("O elfo pergunta se pode ir junto com você  na sua jornada atrás de Balthazar.\n1. Sim, você aceita a ajuda do elfo para juntos irem atrás de Balthazar\n2. Você não aceita a companhia do elfo e segue seu caminho atrás de pistas sobre Balthazar.");
		options = teclado.nextInt();
		if(options==1){
			System.out.println("No caminho para Mergonia você e o elfo avistam servos de Balthazar pelo caminho\nimediatamente você  se esconde, mas os inimigos enxergam o elfo correndo para tentar fugir. \n1. Você corre atrás do elfo para tentar ajudá-lo.\n2. Você não ajuda o elfo pois pode correr o risco de morrer junto com ele.");
			options = teclado.nextInt();
			if(options==1){
				teclado.nextLine();
				System.out.println("Você consegue chegar até o elfo, antes que o inimigo o pegue!");
				teclado.nextLine();
				System.out.println("Prepare-se para batalhar com os inimigos junto ao elfo para continuarem seu caminho até o reino.: ");	
				teclado.nextLine();
				do {
					pontof= escolhe.nextInt(4)+1;
					System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
					ataque = teclado.nextInt();
					if (ataque == pontof) {
						vidam = vidam-100;
						System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
					} else {
						vidap = vidap-0;
						System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
					}
				} while (vidap > 0 && vidam > 0);
				if(vidap > 0){
					teclado.nextLine();
					System.out.println("Você derrotou o inimigo e recuperou sua vida!");
					vidap = 100;
					vidam = 100;
					teclado.nextLine();
					System.out.println("Chegando em Mergonia com o elfo você avista um grande castelo muito escuro e aterrorizante");
					teclado.nextLine(); 
					System.out.println("Você e o elfo se aproximam do  misterioso castelo sombrio e batem na porta para ver se tem alguém.\nUm senhor de barba muito grande e cabelos brancos abre a porta e fala:");
					teclado.nextLine(); 
					System.out.println("Senhor: — Quem são vocês, o  que estão fazendo aqui?");
					teclado.nextLine();
					System.out.println("Elfo: — Nós estamos procurando pistas sobre o maldito mago Balthazar.\nO senhor sabe onde ele pode estar? já que Balthazar saiu desta cidade para devastar toda a nossa região de Lumbridge.");
					teclado.nextLine(); 
					System.out.println("Senhor: — Balthazar está muito longe daqui, saiam daqui e voltam para suas casas!\nRespondeu o senhor grosseiramente fechando a porta do castelo.");
					teclado.nextLine(); 
					System.out.println("Você e o elfo se afastam um pouco dali, \nmas sabem que há algo de estranho nesse castelo pois o senhor falou sobre Balthazar \ncom muita insegurança e medo de que entrassem lá. ");
					teclado.nextLine();
					System.out.println("Imediatamente vocês vão aos fundos do castelo sorrateiramente sem que os seguranças do castelo os vejam \ne conseguem entrar rapidamente se encondendo deles, pela porta dos fundos.");
					teclado.nextLine();
					System.out.println("Ao entrar no castelo o elfo avisa você que achou algo... ");
					teclado.nextLine();
					System.out.println("Você: — o que é isso? ");
					teclado.nextLine();
					System.out.println("Elfo: — veja, é um retrato de balthazar com alguém \ne ao lado está uma dedicatoria dizendo:");
					teclado.nextLine();
					System.out.println(" ''Para meu querido irmão assinado >> Arthur <<'' ");
					teclado.nextLine();
					System.out.println("Você, em estado de choque olha mais uma vez para aquela imagem \ne parece não acreditar no que está vendo, \npois nunca poderia se quer imaginar que o rei Arthur era irmão de Balthazar.");
					teclado.nextLine();
					System.out.println("Rapidamente você fala ao elfo: ");
					teclado.nextLine();
					System.out.println("Você: — Nós estamos no castelo de Balthazar,Eu já sei onde podemos \nencontra-lô, vamos para o reino de Arthur, em Kandarim ");
					teclado.nextLine();
					System.out.println("Elfo: — temos que sairmos rapido desse castelo então, antes que nos peguem. ");
					teclado.nextLine();
					System.out.println("1. Procurar mais pistas sobre balthazar no castelo, correndo perigo se for visto por alguém.\n2. Tentar fugir do castelo o mais rapido possivel com o elfo e ir atrás de Balthazar em Kandarim.  ");
					options = teclado.nextInt();
					if (options == 2){
						teclado.nextLine();
						System.out.println("Você e o elfo, conseguem sair do castelo da mesma forma que entraram e \nfinalmente sentem que estão muito próximos de encontrar Balthazar quando chegarem em Kandarim.");
						teclado.nextLine();
						System.out.println("Chegando em Kandarim, você se dirige diretamente ao castelo do Rei Artur. Lá \ndentro gritos de criança são ouvidos em um alto e bom som.");
						teclado.nextLine();
						System.out.println("O tamanho do castelo acaba se revelando difícil para encontrar a origem dos \ngritos. Você corre desesperadamente, sua família parece estar em perigo e \nprecisa de sua ajuda. ");
						teclado.nextLine();
						System.out.println("Você descobre de onde o som está vindo e chega a ponto de impedir uma \nmorte, um minuto depois seria tarde de mais.");
						teclado.nextLine();
						System.out.println("Você: — Pare agora Balthazar, não seja covarde lute comigo e deixe meu \nfilho no chão, agora. Henrique você está bem?");
						teclado.nextLine();
						System.out.println("Balthazar: — Eu vi você em minhas visões, você estava atrás de mim querendo \nestragar meus planos, me adiantei e cheguei primeiro.");
						teclado.nextLine();
						System.out.println("Você: — Seu assassino, deixe-os é a mim que você deve temer. Saiam daqui, \nessa luta é entre mim e ele.");
						teclado.nextLine();
						System.out.println("Balthazar: — Assassino pra mim é elogio, muitas vidas eu tirei e gostei.");
						teclado.nextLine();
						System.out.println("Você: — Vou vingar a morte de minha mãe e você será morto.");
						teclado.nextLine();
						System.out.println("Balthazar: — Pode até tentar.");
						teclado.nextLine();
						do {
							pontof= escolhe.nextInt(4)+1;
							System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
							ataque = teclado.nextInt();
							if (ataque == pontof) {
								vidam = vidam-100;
								System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
							}else {
								vidap = vidap-0;
								System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
							}
						} while (vidap > 0 && vidam > 0);
						if(vidap > 0){
							teclado.nextLine();
							vidap = 100;
							vidam = 100;
							teclado.nextLine();
							System.out.println("Você: — Agora você morrerá e minha vingança estará feita. Qual são suas últimas palavras.");
							teclado.nextLine();
							System.out.println("Balthazar: — Eu quero que você queime no inferno.");
							teclado.nextLine();
							System.out.println("Você: — Me espere lá então.");
							teclado.nextLine();
							System.out.println("Algo acontece com Balthazar e ele começa a fazer movimentos estranhos.");
							teclado.nextLine();
							System.out.println("Balthazar: — Por favor não me mate, finalmente consegui me libertar. Me deixe viver e lhe mostrarei a verdade.");
							teclado.nextLine();
							System.out.println("1. Acabar com isso de uma vez por todas. \n2. Mostrar misericórdia.");
							options=teclado.nextInt();
							if(options==1){
								teclado.nextLine();
								System.out.println("Sem nenhum ato de misericórdia, com a espada de sua mãe empunhada, \nvocê à lança acertando o peito de Balthazar fazendo com que não houvesse \nnem reação da parte dele...");
								teclado.nextLine();
								System.out.println("Com os problemas resolvidos, você retorna ao reino de Kandarim e informa ao \nrei que Balthazar estava morto e não iria mais causar problemas. Após isso, \ncom os reinos à salvo, você volta para sua casa com sua família, e começa a \nconstruir uma nova vida.");
							}else{
								teclado.nextLine();
								System.out.println("Sem menos esperar, você e Balthazar estão frente a frente, e lentamente ele \ncomeça a aproximar-se:");
								teclado.nextLine();
								System.out.println("Balthazar: — Meu jovem, não se deve confiar completamente em uma pessoa, \nque por mais que pareça perfeito, pode causar surpresas...");
								teclado.nextLine();
								System.out.println(".., ao aproximar-se, com sua grande magia ele lhe mostra visões do passado, \nonde você vê a vida de Balthazar...");
								teclado.nextLine();
								System.out.println("(Agora você está vendo o passado de Balthazar.)");
								teclado.nextLine();
								System.out.println("... 1367, as coisas estavam um pouco diferentes, os reinos estavam intactos e \ntodos vivendo em grande paz.");
								teclado.nextLine();
								System.out.println("Artur: — Balth! O que você quer ser quando crescer? Eu quero ser o homem \nmais poderoso que já existiu.");
								teclado.nextLine();
								System.out.println("Balthazar: — Não sei, eu gostaria de um dia ser um grande guerreiro e lutar \npelo nosso povo quando precisar...");
								teclado.nextLine();
								System.out.println("(Após alguns anos que se passam em míseros segundos em sua realidade, os \nreinos já não estavam mais como antes, mas ainda era um lugar tranquilo \npara viver.)");
								teclado.nextLine();
								System.out.println("Artur: — Irmão, já sei com quem irei passar o resto da minha vida, e vou casar \ncom ela, o que acha?");
								teclado.nextLine();
								System.out.println("Balthazar: — Não acha um pouco cedo? Você ainda nem herdou o trono de \nnosso pai!");
								teclado.nextLine();
								System.out.println("Artur: — Não há problemas nisso, seremos coroados do mesmo jeito!");
								teclado.nextLine();
								System.out.println("(Os anos se passam, Artur já havia se tornado rei de Kandarim, porém, no seu \ncasamento acontece algo terrível. Sua mulher lhe abandona em pleno altar \npara viver com um simples camponês, fazendo com que Artur passasse \nvergonha na frente de todo seu povo, e com isso, Artur se torna um homem \nfrio.)");
								teclado.nextLine();
								System.out.println("Artur: — Balthazar! Junte as tropas, iremos dominar todos os reinos como \nforma de mostrar para esse povo imundo que sou o homem mais poderoso \ndo mundo, e que jamais deveriam ter rido de mim.");
								teclado.nextLine();
								System.out.println("Balthazar: — Artur, pare com isso! Você está cego de raiva por sua mulher ter \nlhe abandonado, e o nosso povo não tem absolutamente nada a ver com sua \nmá escolha.");
								teclado.nextLine();
								System.out.println("Artur: — Não ouse me desrespeitar, tenho o que é preciso para matar todos, e \nprincipalmente sua família, então faça o que eu lhe mandar ou você e sua \nfamília também sofrerão!");
								teclado.nextLine();
								System.out.println("(Sem escolhas, Balthazar com sua magia ajuda Artur a dominar os reinos, \ncausando muitas mortes e destruição...)");
								teclado.nextLine();
								System.out.println("Em um instante você acorda para a realidade, porém não sabe se o que \nBalthazar lhe mostrou é verdade, então decide:");
								teclado.nextLine();
								System.out.println("1. Acreditar em Balthazar e poupar sua vida. \n2. Não dar ouvidos ao Balthazar e vingar a morte de sua mãe");
								options=teclado.nextInt();
								if(options==1){
									teclado.nextLine();
									System.out.println("Você: — Eu acredito em você, onde ele está?");
									teclado.nextLine();
									System.out.println("Balthazar: — Ele está na praça,  todos os reinos foram conquistados, falta \napenas esse. Você precisa ir rápido, neste reino vivem todos aqueles que \nzombaram dele quando foi abandonado no altar.");
									teclado.nextLine();
									System.out.println("Você chega na praça e escuta Artur pregando.");
									teclado.nextLine();
									System.out.println("Artur: — Alguns anos atrás vocês me humilharam, riram e fizeram eu sentir um \nvazio dentro de mim, meu próprio povo. Quando me tornei rei decidi \nconquistar todos os reinos e mostrar a todos do que sou capaz. Misthalin foi \nreduzida à cinzas, em Lorien soltei uma praga que acabou com dois terços \nda população. Agora é a vez de vocês rendam-se e deixem-se serem \nescravizados ou lutem e morram.");
									teclado.nextLine();
									System.out.println("Você: — Eu não vou deixa isso acontecer. Você matou minha mãe e usou \nBalthazar como uma marionete. Desça e lute como um homem, se é que \nvocê é um. Covarde.");
									teclado.nextLine();
									System.out.println("Artur: — Balthazar me falou que você estava tentando estragar nossos planos,\nvocê não conseguirá me derrotar.");
									teclado.nextLine();
									System.out.println("Você: — Você me ajudou por que fez isso? Pensei que fosse um bom rei, mas \nestava enganado.");
									teclado.nextLine();
									System.out.println("Artur: —  Eu sou seu pai, no passado sua mãe e eu tivemos uma história, mas \nela me deixou no altar e me trocou por aquele camponês que você chama de \npai.");
									teclado.nextLine();
									System.out.println("Você: — Conte-me a verdade, o que aconteceu com minha mãe? Foi você, não \nfoi?");
									teclado.nextLine();
									System.out.println("Artur: — Eu tive de fazer isso, ela estava me impedindo de realizar a conquista \nde Misthalin, não restou outra solução a não ser matá-la. Eu sofri tanto \nquanto você, filho me perdoe.");
									teclado.nextLine();
									System.out.println("Você: — Você não é meu pai, você é um monstro. Morra.");
									teclado.nextLine();
									do {
										pontof= escolhe.nextInt(4)+1;
										System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
										ataque = teclado.nextInt();
										if (ataque == pontof) {
											vidam = vidam-100;
											System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
										}else {
											vidap = vidap-0;
											System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
										}
									} while (vidap > 0 && vidam > 0);
									if(vidap > 0){
										teclado.nextLine();
										System.out.println("Você derrotou Artur.");
										vidap = 100;
										vidam = 100;
										teclado.nextLine();
										System.out.println("Quando você pensou que o tinha derrotado, você vira de costas por um \nmomento. Artur se levanta e parte para apunhalá-lo nas costas, mas seu \namigo elfo entra na frente e acaba sendo atingido.");
										teclado.nextLine();
										System.out.println("Elfo: — Vingue minha família...");
										teclado.nextLine();
										System.out.println("Você: — Você o matou .");
										teclado.nextLine();
										System.out.println("Artur:— Eu ainda estou de pé, venha.");
										teclado.nextLine();
										do {
											pontof= escolhe.nextInt(4)+1;
											System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
											ataque = teclado.nextInt();
											if (ataque == pontof) {
												vidam = vidam-100;
												System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
											}else {
												vidap = vidap-0;
												System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
											}
										} while (vidap > 0 && vidam > 0);
										if(vidap > 0){
											teclado.nextLine();
											vidap = 100;
											vidam = 100;
											teclado.nextLine();
											System.out.println("Artur: — Termine logo com isso.");
											teclado.nextLine();
											System.out.println("Você: — Eu, eu não consigo. Eu não sou esse tipo de pessoa.");
											teclado.nextLine();
											System.out.println("Artur: — Você não é meu filho mesmo, você é um fraco...");
											teclado.nextLine();
											System.out.println("Balthazar: — Eu faço. Isso é por você ter feito eu matar todas aqueles pobres \ninocentes.");
											teclado.nextLine();
											System.out.println("Balthazar corta a cabeça de Artur que sai rolando e sua coroa cai.");
											teclado.nextLine();
											System.out.println("Balthazar: — Você é o legítimo herdeiro, aceite essa coroa e governe como \nArtur nunca fez.");
											teclado.nextLine();
											System.out.println("1. Aceitar \n2. Não aceitar.");
											options=teclado.nextInt();
											if(options==1){
												teclado.nextLine();
												System.out.println("Você: — Será uma honra.");
												teclado.nextLine();
												System.out.println("Balthazar: — Vida longa ao novo rei");
												teclado.nextLine();
												coroa();
											}else{
												teclado.nextLine();
												System.out.println("Você não aceita ser rei e passa a coroa para a próxima pessoa na linha de \nsucessão, Balthazar.");
												teclado.nextLine();
												System.out.println("Você: — Aceite Balthazar, você merece por todo esse tempo que sofreu nas \nmãos de seu irmão. Vida longa ao novo rei.");
												teclado.nextLine();
												coroa();
											}
										}else{
											System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
											vidap = 100;
											vidam = 100;
										}
									}else{
										System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
										vidap = 100;
										vidam = 100;
									}
								}else{
									teclado.nextLine();
									System.out.println("Sem nenhum ato de misericórdia, com a espada de sua mãe empunhada, \nvocê à lança acertando o peito de Balthazar fazendo com que não houvesse \nnem reação da parte dele...");
									teclado.nextLine();
									System.out.println("Com os problemas resolvidos, você retorna ao reino de Kandarim e informa ao \nrei que Balthazar estava morto e não iria mais causar problemas. Após isso, \ncom os reinos à salvo, você volta para sua casa com sua família, e começa a \nconstruir uma nova vida.");
								}
							}
						}else{
							teclado.nextLine();
							System.out.println("Balthazar: Você falhou e agora será seu fim.");
							teclado.nextLine();
							System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
							teclado.nextLine();
							vidap = 100;
							vidam = 100;
						}
					}else{
						System.out.println("Tentando procurar mais pistas no castelo de Balthazar, você é visto pelo senhor que fechou a porta do castelo na sua cara \ne não tem chances contra os seguranças do castelo, que estão em maioria e acaba morrendo junto ao elfo tentando fugir!" );
						teclado.nextLine();
						System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
						teclado.nextLine();
					}	
				}else{
					teclado.nextLine();
					System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
					teclado.nextLine();
				}
			}else{
				teclado.nextLine();
				System.out.println("Seguindo seu rumo sozinho abandonando o elfo\nvocê é surpreendido por inimigos nas costas \ne acaba sendo morto por uma flecha na cabeça ! ");
				teclado.nextLine();
				System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
				teclado.nextLine();
			}
		}else{
			teclado.nextLine();
			System.out.println("Seguindo seu rumo sozinho abandonando o elfo\nvocê é surpreendido por inimigos nas costas \ne acaba sendo morto por uma flecha na cabeça ! ");
			teclado.nextLine();
			System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
			teclado.nextLine();
		}		
	}
	public static void Lorien(){
		int menu, pontof, options, ataque, vidam = 100, vidap = 100;
		String nome;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Você avista um \nsenhor encostado a uma árvore, este parecia muito doente. Você decide...\n1. seguir seu caminho para o reino\n2. ajudar o senhor");
		options = teclado.nextInt();
		if (options == 1) {
			teclado.nextLine();
			System.out.println("Tomado pela raiva você decide seguir caminho para chegar mais rápido ao \nReino e ver se tem notícias de Balthazar. Você caminha por mais algumas \nhoras, quando de repente enxerga o grande Reino desconhecido.");
			teclado.nextLine();
			System.out.println("Chegando lá não vê ninguém. Parece que tudo foi abandonado. Você resolve \nexaminar o local. Entra em algumas casas, e sente um forte de cheiro. Eles \nnão deixaram vestígios de nada. Nem sinal de pessoas.");
			teclado.nextLine();
			System.out.println("Depois de horas analisando, escuta alguns gritos vindos da igreja do local. Vai \naté lá e encontra um senhor.");
			teclado.nextLine();
			System.out.println("Você: — Olá, estou à procura de Balthazar. Quando cheguei aqui não \nencontrei ninguém, parece que este reino foi desabitado. O que aconteceu?");
			teclado.nextLine();
			System.out.println("Senhor: — Você não sabe o que aconteceu? Nosso reino foi tomado por uma \ngrande peste, esta matou mais de 2/3 da população daqui. Estamos em \napuros, cada dia mais mortes, e mais contaminados. Não há cura.");
			teclado.nextLine();
			System.out.println("Você: — Meu Deus! Onde estão os infectados? Pode ser que os corpos \nestejam contaminando mais pessoas.");
			teclado.nextLine();
			System.out.println("Senhor: — Os infectados estão no porão da igreja. Você vê aquela pilha de \ncorpos à sua direita? Só restaram eu e mais algumas pessoas.");
			teclado.nextLine();
			System.out.println("Você: — Você tem que queimar os corpos, antes que contaminem mais \npessoas. E quanto aos infectados, ninguém pode ter contato com eles.");
			teclado.nextLine();
			System.out.println("O que deseja fazer?\n1. Ajudar o senhor a queimar os corpos\n2. Não ajudar, e perguntar sobre Balthazar");
			options = teclado.nextInt();
			if (options == 1) {
				teclado.nextLine();
				System.out.println("Você fica com pena do senhor, e começa a o ajudar. Primeiro arrasta os \ncorpos, e os empilha em um lugar afastado da igreja, onde estavam alguns \ninfectados. Depois disso, você e o senhor pegam uma tocha e ateiam fogos \nnos corpos. O fogo se alastra e acaba atingindo uma casa, que também \nficava um pouco afastada da cidade. Vocês controlam o incêndio, e o senhor \nagradece.");
				teclado.nextLine();
				System.out.println("Você começa a sentir mal e o senhor começa a se afastar de você.");
				teclado.nextLine();
				System.out.println("Senhor: — Você pegou a peste, meu Deus, você precisa ir para o porão da \nigreja, antes que seja tarde. Se ficar poderá contaminar os sobreviventes.");
				teclado.nextLine();
				System.out.println("Você se apavora, mas prefere salvar algumas vidas. Você se dirige ao local, \njunto aos infectados, e apenas aceita a morte.");
				teclado.nextLine();	
				System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
				teclado.nextLine();	
			} else { 
				teclado.nextLine();
				System.out.println("Você se recusa ajudar o senhor, e pergunta:");
				teclado.nextLine();
				System.out.println("Você: — Gostaria de saber se você tem notícias de Balthazar.");
				teclado.nextLine();
				System.out.println("Senhor: — Você não sabe? Ele está desaparecido há algum tempo. Faz \nbastante tempo que ele não vem para Lorien.");
				teclado.nextLine();
				System.out.println("Você: — Você sabe onde posso o encontrar");
				teclado.nextLine();
				System.out.println("Senhor: — Sei que Balthazar nasceu no reino de Mergonia, talvez encontre \npistas por lá.");
				teclado.nextLine();
				System.out.println("Você: — Ok, obrigado.");
				teclado.nextLine();
				System.out.println("Você segue seu caminho até o reino de Mergonia.");
				teclado.nextLine();
				System.out.println("No caminho você encontra o elfo novamente.");
				teclado.nextLine();
				elfoparte2();
			}
		}else{
			teclado.nextLine();
			System.out.println("Você fica com pena do pobre senhor que estava indefeso em meio a uma \nfloresta tão perigosa e pergunta o que ele tem...");
			teclado.nextLine();
			System.out.println("Você: — Com licença, vi que o senhor está muito doente, e gostaria de ajudá-lo\n. O que o senhor está sentindo?");
			teclado.nextLine();
			System.out.println("Senhor: — Claro meu filho... estou com calafrios, febre, dores de cabeça, e \nestou tossindo sangue. Acho que tenho poucas horas. Estou com muita \nfome. Olhe...\nEle aponta para uma poça de sangue ao seu lado.");
			teclado.nextLine();
			System.out.println("Você: — Tome, pegue um pouco da minha comida... Em seguida seguiremos \npara o Reino de Lorien, desconhecido em minha terra. Procuraremos abrigo \npara você. \nVocê espera o senhor terminar de comer, e o ajuda a andar. Vocês seguem \ncaminho.");
			teclado.nextLine();
			System.out.println("Depois de algumas horas de caminhada, começa a sentir mal. Você está com \nos mesmos sintomas do senhor. Vocês avistam o reino, e logo veem alguns \nsoldados. Estes logo percebem que o senhor e você também estão doentes. \nEles fingem conversar, e acertam seu coração, sem que você tenha alguma \nchance.");
			teclado.nextLine();
			System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
			teclado.nextLine();	
		}
	}
	public static void partedemonio(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Você chega no bloco de celas, onde algumas pessoas estão presas e anda \npelo corredor na esperança de encontrá-los.");
		teclado.nextLine();
		System.out.println("Pessoa 1: — Têm um escravo fora da cela, liguem a sirene e chamem o \ncomandante vermelho.");
		teclado.nextLine();
		System.out.println("É hora de fugir novamente. De relance você pensa ver a imagem na sua família \nem uma cela de apenas três paredes e para, com o intuito de se certificar que \nnão eram eles.");
		teclado.nextLine();
		System.out.println("Henrique: — Papai, você veio nos salvar.");
	}
	public static void coroa(){
		Scanner teclado= new Scanner (System.in);
		System.out.println("Todas as pessoas falam como uma voz só e clamam pelo novo rei");
		teclado.nextLine();
		System.out.println("Elfo: — Você conseguiu...");
		teclado.nextLine();
		System.out.println("Você: — Elfo você está vivo. Balthazar salve ele, eu sei que você é capaz.");
		teclado.nextLine();
		System.out.println("Balthazar: — Eu só posso curá-lo dando um pouco da vida de outra pessoa \npara ele.");
		teclado.nextLine();
		System.out.println("Você: — Faça comigo. ");
		teclado.nextLine();
		System.out.println("Balthazar lança o feitiço e o elfo se cura instantaneamente.");
		teclado.nextLine();
		System.out.println("Você: — Meu amigo, você está de volta.");
		teclado.nextLine();
		System.out.println("Elfo: — Graças a você.");
		teclado.nextLine();
		System.out.println("Mais tarde naquele mesmo dia, logo depois da cerimônia de coroação você e \nsua família começam a construir um novo mundo");
		teclado.nextLine();
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random escolhe = new Random();		
//###############------------VARIAVEIS---------------------##############################
		int menu, pontof, options, ataque, vidam = 100, vidap = 100, familia=0;
		String nome;
//#######################################################################################		
//### EN-US #############################################################
		do {
			System.out.println("|====================|\n|     THE SWORD      |\n|         OF         |\n|       REVENGE      |\n|====================|");
			System.out.println("|======= MENU =======|\n| 1. New Game        |\n| 2. Options         |\n| 3. Exit            |\n|====================|");
			menu = teclado.nextInt();
//### START GAME ##################################################
			if (menu == 1) {
				System.out.println("Choose a name for the character: ");
				nome= teclado.next();
				teclado.nextLine();
				System.out.println("Press enter to continue...");
				teclado.nextLine();
				System.out.println("Sales season, "+nome+", son of a family that lived in the countryside, whos\nchildhood was marked by the murder of his mother who died in a battle,\nfighting for his people, is sent to town to sell wool and help his family. Upon \narriving, he finds the city partially destroyed, dominated by darkness. On \nthe way, listen to people commenting on the return of an evil sorcerer, Balthazar.");
				teclado.nextLine();
				System.out.println("The evil wizard was known in his people as the destroyer of kingdoms, because \nany kingdom who entered in war with him, turned ashes, due to its \nextremely destructive magic and frightening.");
				teclado.nextLine();
				System.out.println("To come across the name “Balthazar”, "+nome+" remember the story told by his father, \nand realizes that Balthazar was the one who had killed his mother, making him think in \nnothing but revenge.");
				teclado.nextLine();
				System.out.println("You go to the King's Castle in search of information about Balthazar, he is the only \nwho should know about something...");
				teclado.nextLine();
				System.out.println("You: — Your Majesty, my name is "+nome+", and I heard that you were a friend of my mother \nAthena. I came here to sell wool and on the way I heard that Balthazar was \nback. As a friend, could you clarify what really happened to my mother? \nMy father never told me the whole story.");
				teclado.nextLine();
				System.out.println("King Artur: — "+ nome +", are you? I met you when you were a baby, how you've grown. Call me Arthur \nplease. Well, let's cut to the Chase, as the Kingdom A was the most \nclose to my Kingdom, I received a letter containing a request for help. It was written that the troops \nBalthazar were approaching the Realm A and needed a large army. I couldn't refuse, I assumed that if the Kingdom fell \nnext attacked would be mine, and as King it is my duty to protect my people, so I advanced quickly to \nthe field of battle and fought side by side with his mother against the forces of \nWizard Balthazar.");
				teclado.nextLine();
				System.out.println("You: — You did what was necessary. Is there anything you know about Balthazar?");
				teclado.nextLine();
				System.out.println("Because the use of much of his power, Balthazar has weakened and soon after the battle \ndisappeared for a time to regain his power. A while ago I also heard rumors that \nBalthazar was back, but this time stronger and powerful, determinated to \nfinish what started, the domine of the 5 Kingdoms. The allies of Balthazar \nare everywhere, be careful. Here's something with me that will protect you ... \n\n...King Artur opens a chest inside reveals a sword red-blood encrusted jewelry... \n\nKing Artur: — This is the sword of his mother, on her deathbed \nshe made me promise that one day I would give you, and here it is. Take.");
				teclado.nextLine();
				System.out.println("...King Artur throws the sword into your hands. You gets in the way and let it fall...");
				teclado.nextLine();
				System.out.println("You: — I never held one before, I've always lived in the countryside with my family, I don't have \nabsolutely no idea how to use it.");
				teclado.nextLine();
				System.out.println("King Artur: — I realized... If you want I am available to teach you some tricks \nessential to survive.");
				teclado.nextLine();
				System.out.println("You: — Of course, I need to keep my wife and children safe.");
				teclado.nextLine();
				System.out.println("King Artur: — You have kids, I'd love to meet them. I can keep them safe here in my Castle \nif necessary.");
				teclado.nextLine();
				System.out.println("You: — You're being too kind, that way I will be suspicious.");
				teclado.nextLine();
				System.out.println("King Artur: — Haha. His mother saved me one day, this is my way of repay. Let's start.");
				teclado.nextLine();
//### BATTLE TUTORIAL ##################################################
				System.out.println("\n-------------------------------------------------------------------------------------------------------------\nWELCOME TO THE BATTLEFIELD, HERE YOU WILL BE TRAINED TO BE ABLE TO DEFEAT YOUR ENEMIES DURING YOUR ADVENTURE!\n-------------------------------------------------------------------------------------------------------------\nYour sword has a special power, when you defeat an enemy you gain strength and retrieves your life, so be careful\nand make choices with wisdom. Let's start\n\nNote: To defeat the enemy, one hit will not be enough, so you must choose where you want to attack, if you hit it, \nthe enemy lose life, otherwise it will attack you. \n(Be careful because you only have 4 chances)");
				teclado.nextLine();
				do {
					pontof= escolhe.nextInt(4)+1;
					System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
					ataque = teclado.nextInt();
					if (ataque == pontof) {
						vidam = vidam-50;
						System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
					} else {
						System.out.println("You missed! Try again.\n");
					}
				} while (vidam > 0);
				System.out.println("--------------------------------------------------------------\nTutorial completed, now you are ready to start your adventure!\n--------------------------------------------------------------\n");
				vidam = 100;
				teclado.nextLine();
				System.out.println("King Artur: — Very good, you learn fast! Accept this map and don't get lost on \nthe way.");
				teclado.nextLine();
				System.out.println("You thank for the granted information and go your way. \n1. You want to go back home and tell your family \n2. You want to go your way alone");
				options=teclado.nextInt();
				if(options==1){
					teclado.nextLine();
					System.out.println("Coming home, you tell your wife Catarina that you will in search of the man \nwho killed your mother and will take them safely to the castle of King Arthur.");
					teclado.nextLine();
					System.out.println("When it is told, the little Henrique, your youngest son, demonstrates a tremendous \nenthusiasm in the 'adventure' to the castle that will follow, but someone \nseems to be missing. You goes to your daughter Isabella's room and \ndiscovers that while you was out she got sick. One of the best doctors of the 5 \nKingdoms is in Kandarim.");
					teclado.nextLine();
					System.out.println("On the way back to the Castle you find an alternate way of the main road, \nlooking scared and uninhabited, but it takes half the time to the Castle. You \nneed to be quick, your daughter needs medical attention, make your decision \nnow: \n1. Follow in the main road\n2. Follow in the alternative way");
					options=teclado.nextInt();
					if(options==1){
						teclado.nextLine();
						System.out.println("Everything is fine, but in the way you found an enemy determinataded to kill \nyou. Attack him.");
						teclado.nextLine();
						do {
							pontof= escolhe.nextInt(4)+1;
							System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
							ataque = teclado.nextInt();
							if (ataque == pontof) {
								vidam = vidam-50;
								System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
							} else {
								vidap = vidap-25;
								System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
							}
						} while (vidap > 0 && vidam > 0);
						if(vidap > 0){
							System.out.println("You defeat the enemy and recovered your life!\n");
							vidap = 100;
							vidam = 100;
							teclado.nextLine();
							System.out.println("Arriving at the Castle, you discover that King Arthur is not. You leave your \nfamily under the care of the King's Butler and say goodbye.");
							teclado.nextLine();
							elf();
						}else{
							teclado.nextLine();
							System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
							teclado.nextLine();
							vidap = 100;
							vidam = 100;
						}
					}else{
						teclado.nextLine();
						System.out.println("You and your family listen steps, Balthazar's servants are following you. You try \nto move quickly, but end up falling into an ambush and are surrounded.\n1. Attack \n2. Surrender\n3. Escape");
						options= teclado.nextInt();
						if(options==1){
							teclado.nextLine();
							System.out.println("You try to attack, but before youhave a chance a Red Devil cuts off your \narm and makes you watch your family get killed right in front of you, then it's \nyour time.");
							teclado.nextLine();
							System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
							teclado.nextLine();
						}else{
							if(options==2){
								teclado.nextLine();
								System.out.println("When you surrender, the enemies take your sword and hit on the \nhead leaving you unconscious. Dawn, you wake up with the incessant sound \nof the bird, your family seems to be missing.");
								teclado.nextLine();
								System.out.println("1. Search for clues to the whereabouts of your family \n 2. Continue your way to the castle.");
								options=teclado.nextInt();
								if(options==1){
									teclado.nextLine();
									System.out.println("You walk a few steps until a smell of rotting flesh takes care of the air, a little \nmore forward something seems to be swinging in a tree, is a body, the \nsmellseems to be coming from him. When approaching finds the \nbody hung by a rope and with an arrow in his chest, you pull the arrow from \nthe corpse's chestand examines. Made of a partially burnt wood, youcomes \nto the conclusion that your family is possibly in the place where the \narrow was made. Where you want to go: \n1. Misthalin; \n2. Lorien; \n3. Mergonia; \n4. Kandarim.");
									options=teclado.nextInt();
									if(options==1){
									teclado.nextLine();
									System.out.println("This was the first time that you went to Misthalin and maybe  the last, there \nare ashes everywhere, the air temperature resembles a steam and ash cloud \ndoes not allow the Sun to shine here.");
									teclado.nextLine();
									System.out.println("Even with the difficulties that the place looks, you can \nsee a house inhabited. You knock on the door. TOC TOC.");
									teclado.nextLine();
									System.out.println("Madam: — Please don't take us. We don't have anything else to ... Hey, you're \nnot one of them.");
									teclado.nextLine();
									System.out.println("You: — One of them? Who?");
									teclado.nextLine();
									System.out.println("Madam: — The monsters, they took my baby. Me and my husband we \ncan escape, had a wagon stop just below a window, jumped, we came \nback here and since then they come over here in search of food, otherwise \nwe will be taken back and my son will be dead.");
									teclado.nextLine();
									System.out.println("You: — Do you know where where they took your son?My family was taken a \nshort time.");
									teclado.nextLine();
									System.out.println("Sir: — I know, and I can show you the way, but only if you promise to save our \nchild. \n1. Accept help \n2. Deny help.");
									options=teclado.nextInt();{
									if(options==1){
										teclado.nextLine();
										System.out.println("You: — I promise. Now come on, they don't have much time.");
										teclado.nextLine();
										System.out.println("Sir: — Wait, I got something here for you.");
										teclado.nextLine();
										System.out.println("The sir delivers a sword a little rusty, but what shows better than anything.");
										teclado.nextLine();
										System.out.println("You: — Thanks, mine was stolen.");
										teclado.nextLine();
										System.out.println("Minutes pass and as you advance the temperature increases. You look to \nheaven and sees a cloud of rain forming, a drop falls and hits your \narm, instantly you feel a burning sensation.");
										teclado.nextLine();
										System.out.println("Sir: — Quickly, we need to seek shelter.");
										teclado.nextLine();
										System.out.println("You: — What is this? Is burning.");
										teclado.nextLine();
										System.out.println("Sir: — The ashes rise until the clouds resulting in a change of \ntemperature. Where are we going?\n1. Go back to the House of the Lord \n2. Enter the cave \n3. Continue your path usually");
										options=teclado.nextInt();
										if(options==1){
											teclado.nextLine();
											System.out.println("The House is too far and you do not have much time for the rain to start \na combustion in your bodies completely burning flesh. Your \nashes are now part of Misthalin.");
											teclado.nextLine();
											System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
											teclado.nextLine();
										}else{
											if(options==2){
												teclado.nextLine();
												System.out.println("Cave inside, hours without eating end up resulting in nothing but a great \nfamine, with the rain outside the possibility of \nfinding food just proving impossible. Shortly there after in the darkness of the \ncave a roar is heard, you think it's just the belly of the sir being so hungry as \nyou and try to sleep.");
												teclado.nextLine();
												System.out.println("Sir: — Wake up boy. There's a bear here, we have to kill him before we will \ncome your meal.");
												teclado.nextLine();
												System.out.println("You to back the bear for a moment to grab his sword and is knocked down, the \nbear stands on its hind legs to give his final attack and ends up being hit in \nthe stomach by the Lord.");
												teclado.nextLine();
												System.out.println("You: — Thank you, you saved my life.");
												teclado.nextLine();
												System.out.println("Sir: — No thanks, now take that bear skin, looks like we got our dinner.");
												teclado.nextLine();
												System.out.println("You eat and recover your strength, the rain stops and it's time to continue your \njourney.");
												teclado.nextLine();
												System.out.println("Sir: — I'm just up here, move on a few more meters and you will find your \nway. Save my son, his name is George, he is a good boy.");
												teclado.nextLine();
												System.out.println("You: — Okay, your child will come home safe and sound.");
												teclado.nextLine();
												System.out.println("Sir: — thank you so much boy, stay with the sword I won't use it.");
												teclado.nextLine();
												System.out.println("By far a Dark Tower is sighted, the sound of metal against metal is heard. When \napproaching you see people being enslaved to the construction of \nnew swords and armor and a training camp on the other \nside, where some unidentified silhouettes train in combat.");
												teclado.nextLine();
												System.out.println("Something causes the fire of the forge reflects on your face, you don't your eyes \nand discover the origin of the reflection, the sword of your mother's on the \nback of one of the enemies.");
												teclado.nextLine();
												System.out.println("You wait till he's alone and are addressing it surreptitiously.\n1. Attack by surprise \n2. Run");
												options=teclado.nextInt();
												if(options==1){
													teclado.nextLine();
													System.out.println("The surprise attack was not as effective, the enemy loses only half of his \nlife. Finish him.");
													teclado.nextLine();
													vidam=vidam-50;
													do {
														pontof= escolhe.nextInt(4)+1;
														System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
														ataque = teclado.nextInt();
														if (ataque == pontof) {
															vidam = vidam-50;
															System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
														} else {
															vidap = vidap-25;
															System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
														}
													} while (vidap > 0 && vidam > 0);
													if(vidap > 0){
														vidap = 100;
														vidam = 100;
														teclado.nextLine();
														System.out.println("You retrieve the sword and feel its power coursing through your body when your \nlife is restored.");
														teclado.nextLine();
														System.out.println("There are two enemies guarding the door, face them at the same time it will be \ndifficult, a way to separate them needs to be thought through.");
														teclado.nextLine();
														System.out.println("Minutes on a stakeout ends up showing useful, one of them needs to relieve the \nbladder and heading to the corner of the fortress. \n1. Attack the guard \n2. Engage the enemy corner. \n3. Do not to attack.");
														options=teclado.nextInt();
														if(options==1){
															teclado.nextLine();																
															System.out.println("You approach to attack the guard, but are surprised by the enemy that had \ncome out and ends up having the sword stuck in the middle of the chest.");
															teclado.nextLine();
															System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
															teclado.nextLine();
														}else{
															if(options==2){
																teclado.nextLine();
																System.out.println("You approach the enemy and strikes a blow to virtuoso separating his \nhead from the rest of the body,when approaching you note what's left of \nthe neckof the enemy a identification plate with the name ' George '.");
																teclado.nextLine();
																System.out.println("It is necessary a few seconds to process the Act, your own voice in your \nhead: 'You promised to save his life, and look what you've done.'");
																teclado.nextLine();
																System.out.println("You fall on your knees and hug the dead body as if he were his own son.");
																teclado.nextLine();
																System.out.println("You: — Sorry, I had no idea it was you. I'm a monster, took the life of an \ninnocent boy.");
																teclado.nextLine();
																System.out.println("'You don't deserve forgiveness, look in his eyes, he had a whole life ahead of \nher and was taken by you.You're just a selfish he did what he did to save the \nlives of his family and not think about the other prejudiced.'");
																teclado.nextLine();
																System.out.println("Tears trickle down your face, steps are heard coming from your back, but you \ndon't care.");
																teclado.nextLine();
																System.out.println("A sword being unsheathed, you don't make any effort to defend himself, feels \nthat your life should be taken by mistake you just made. Out of the corner of \nyour eye you see the enemy putting the sword aloft to deal him a deadly \nattack.");
																teclado.nextLine();
																System.out.println("Sir: — Run "+nome+", I take care of him.");
																teclado.nextLine();
																System.out.println("You are ungrounded and don't understand what's going on your way, he should \nhave left, but for some reason was.");
																teclado.nextLine();
																System.out.println("The man who showed you the way is now grappling with one of the enemy to \nsave your life. Three attacks were enough to break the old rusty \nsword in two. Soon after the sword of the enemy enters the chest of poor Sir \nand passes through your body, it is possible to see the bloody end on your \nback.");
																teclado.nextLine();
																System.out.println("Sir: — Sav-ve m-my son.");
																teclado.nextLine();
																System.out.println("His last words serve to get back to real life. You get up, pick up the \nsword and go to the attack.");
																teclado.nextLine();
																do {
																	pontof= escolhe.nextInt(4)+1;
																	System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
																	ataque = teclado.nextInt();
																	if (ataque == pontof) {
																		vidam = vidam-50;
																		System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
																	} else {
																		vidap = vidap-25;
																		System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
																	}
																} while (vidap > 0 && vidam > 0);
																if(vidap > 0){
																	System.out.println("You defeat the enemy and recovered your life!\n");
																	vidap = 100;
																	vidam = 100;
																	teclado.nextLine();
																	System.out.println("Even after he is dead you're still striking the enemy many times taking all your \nanger. Blood flows everywhere, and covers your face.");
																	teclado.nextLine();
																	System.out.println("Something stuck in the enemy get your attention, keys of all kinds, sizes and \nshapes. You just find a way to enter the tower.");
																	teclado.nextLine();
																	System.out.println("You deduct the greater must be the right key to open the main gate, \nwhich shows correct when the gate opens with a strong creak of hinges \nthat don’t get oil for centuries.");
																	teclado.nextLine();
																	System.out.println("Inside the Tower, it ends up showing a frightening size, halls and rooms for all \nsides and stairs to all directions.");
																	teclado.nextLine();
																	System.out.println("Someone let out a grunt, you look in the direction of the sound \nand see a person strapped to apole being whipped. The thing that holds the \nwhip is familiar to you, the Red Devil who helped in the capture of your \nfamily. Soon after finishing with the whipping he retires, you try to follow \nhim, but in the way drop a box that makes a loud bang and calls attention \nto you. Sirens and the main gate is locked from the outside in order to keep \nit, you need to find a hiding place before it is caught. There are 3 \nrooms, choose one. \n1. Hide in cooling Chamber \n2. Hide in the bodies's room \n3. Hide in the cremation room");
																	options=teclado.nextInt();
																	if(options==1){
																		teclado.nextLine();
																		System.out.println("You walk into the room and shut the door, but what you didn't know is that it \ncan be opened only from the outside. Your body begins to cool and \nthen you freeze to death.");
																		teclado.nextLine();
																		System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																		teclado.nextLine();
																	}else{
																		if(options==2){
																			teclado.nextLine();
																			System.out.println("Upon entering the room, you have a vision nothing nice, dozens of bodies are \nstacked against the wall right waiting for the release of the cremation \nChamber. Insects of all kinds devour the flesh, there are bodies that seem to \nbe days there, with their bones shows.");
																			teclado.nextLine();
																			System.out.println("You lie down and put bodies on your not to be found.");
																			teclado.nextLine();
																			System.out.println("Someone enters the room:");
																			teclado.nextLine();
																			System.out.println("Pessoa1: — He wouldn't come down here, or I can take this awful smell.");
																			teclado.nextLine();
																			System.out.println("Pessoa2: — The Commander sent us here, we need to look for.");
																			teclado.nextLine();
																			System.out.println(" Some bodies are taken from the place, but once the siren ringing they enclose.");
																			teclado.nextLine();
																			System.out.println("Person1: — Did someone find him?");
																			teclado.nextLine();
																			System.out.println("Person3: — Yes, he was out there all the time. He was killed by one of our guards.");
																			teclado.nextLine();
																			System.out.println("Person1: — Outside? But we locked here.");
																			teclado.nextLine();
																			System.out.println("Person3: — He must have escaped somewhere.");
																			teclado.nextLine();
																			System.out.println("Person1: — Let's get the body.");
																			teclado.nextLine();
																			System.out.println("The dead is placed next to you, George's father saved your life even after \nlosing his.");
																			teclado.nextLine();
																			System.out.println("To leave the room, everything seems to be back to normal. You spend in \nfront of a door and sleeping there is the Red Devil, for the size of the \nroom he looks like to be the Commander. He hears your footsteps and start to \nfight with you.");
																			teclado.nextLine();
																			do {
																				pontof= escolhe.nextInt(4)+1;
																				System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
																				ataque = teclado.nextInt();
																				if (ataque == pontof) {
																						vidam = vidam-50;
																						System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
																					} else {
																						vidap = vidap-25;
																						System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
																					}
																				} while (vidap > 0 && vidam > 0);
																				if(vidap > 0){
																					System.out.println("You defeat the demon, but leave him alive, he will have other utility");
																					vidap = 100;
																					vidam = 100;
																					teclado.nextLine();
																					System.out.println("You tie the demon in the chair and begin to torture him to know where are your \nfamily.");
																					teclado.nextLine();
																					System.out.println("You: — Where is my family? You kidnapped them, I was there.");
																					teclado.nextLine();
																					System.out.println("Demon: — Everyday, people are brought here, do you really think I remember \nyou and your family?");
																					teclado.nextLine();
																					System.out.println("You cut one of his fingers slowly with a kitchen knife");
																					teclado.nextLine();
																					System.out.println("You: — My daughter is sick and needs medical attention. Where is my \nfamily? Answer me!");
																					teclado.nextLine();
																					System.out.println("Demon: — So you're the father of that sick? Hahaha. She's dead, had to be \nsacrificed and served as a feast to me.");
																					teclado.nextLine();
																					System.out.println("Torture seems to be proving ineffective, it's time to get heavy. You take the oil \nlampon the wall and pour the liquid into his face.");
																					teclado.nextLine();
																					System.out.println("Demon: — She was very tasty, hmmm I've never had anything like it, I’m loving \nthe shower.");
																					teclado.nextLine();
																					System.out.println("You: — Tell me where is my family or you die.");
																					teclado.nextLine();
																					System.out.println("Demon: — Dead. They're dead, your little screamed so much when we eat him alive.");
																					teclado.nextLine();
																					System.out.println("1. Leave him alive. \n2. Kill him.");
																					options=teclado.nextInt();
																					if(options==1){
																						teclado.nextLine();
																						System.out.println("You leave the room and continue to search for your family in the \nTower, something in the history of the devil didn't seem true, he hesitated too \nmuch, your family got a chance to be alive.");
																						teclado.nextLine();
																						demon();
																						teclado.nextLine();
																						System.out.println("You hear the sound of something flying in the air, to turn around a \nhatchet hit your head.");
																						teclado.nextInt();
																						System.out.println("Demon: — You should have killed me as you had the chance.");
																						teclado.nextLine();
																						System.out.println("Henrique: — Daddy, stop playing, I'm seeing you with your eyes open.");
																						teclado.nextLine();
																						System.out.println("Catarina takes Henrique into her arms and collapses in tears.");
																						teclado.nextLine();
																						System.out.println("Henrique: — Mom what was? Daddy's just joking aren't you? Daddy?");
																						teclado.nextLine();
																						System.out.println("Henrique realizes what happened in front of him and run away from his \nmother's arms to cry in the corner of the cell.");
																						teclado.nextLine();
																						System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																						teclado.nextLine();
																					}else{
																						teclado.nextLine();
																						System.out.println("After killing him you leave the room and continues to search for your family in \nthe Tower, something in the history of the devil didn't \nseem true, he hesitated too much, his family got a chance to be alive.");
																						teclado.nextLine();
																						demon();
																						teclado.nextLine();
																						System.out.println("You: — Finally found you. Yes son, now wake up his mother and sister.");
																						teclado.nextLine();
																						System.out.println("Henrique: — Mamma look Daddy's here, wake up, wake up.");
																						teclado.nextLine();
																						System.out.println("Catarina: — You found us, thank God. Isabella is very sick, we need to get out \nof here.");
																						teclado.nextLine();
																						System.out.println("You: — I'm going to get you out of there I'm looking for the key with the \nnumber of the cell.");
																						teclado.nextLine();
																						System.out.println("You found 3 keys with the matching number, choose wisely, the enemies \nare close to you. \n1. Choose circular key \n2. Choose square key \n3. Choose triangular key.");
																						options=teclado.nextInt();
																						if(options==1 || options ==3){
																							teclado.nextLine();
																							System.out.println("You test the key but it shows incorrect, when trying to change key you ends up \nbeing hit by an axe directly in the back.");
																							teclado.nextLine();
																							System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																							teclado.nextLine();
																						}else{
																							teclado.nextLine();
																							System.out.println("The door makes a little noise when the correct key opens the door.");
																							teclado.nextLine();
																							System.out.println("You: — Let’s go, they are over there.");
																							teclado.nextLine();
																							System.out.println("In the next room is a lonely kid that asks for help.");
																							teclado.nextLine();
																							System.out.println("Boy: — Sir, let me out of here please, my mother is waiting for me.");
																							teclado.nextLine();
																							System.out.println("1. Help the child 2. It does not help.");
																							options=teclado.nextInt();
																							if(options==1){
																								teclado.nextLine();
																								System.out.println("You throw the key to the boy and continues to search for a way out, the main \ngate is locked.zwse");
																								teclado.nextLine();
																								System.out.println("Someone throw an axe that pass shaving for you, a second more, you'd be \ndead.");
																								teclado.nextLine();
																								System.out.println("You go to the Armory and you and your family get armed with shields and \nswords.");
																								teclado.nextLine();
																								System.out.println("You go to the next floor, there some enemies were waiting. Isabella is low and \nlittleHenrique is too young to know how to use a sword, the battle ends up \nbeing betweenyou and Catarina against four others. In your head you \nthink the battle is lost, but an unexpected aid ends up giving new hopes.");
																								teclado.nextLine();
																								System.out.println("Boy: — You saved my life, now it's my turn to give back. I take these two here.");
																								teclado.nextLine();
																								do {
																									pontof= escolhe.nextInt(4)+1;
																									System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
																									ataque = teclado.nextInt();
																									if (ataque == pontof) {
																										vidam = vidam-50;
																										System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
																									} else {
																										vidap = vidap-25;
																										System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
																									}
																								} while (vidap > 0 && vidam > 0);
																								if(vidap > 0){
																									System.out.println("You defeat the enemy and recovered your life!\n");
																									vidap = 100;
																									vidam = 100;
																									teclado.nextLine();
																									System.out.println("The boy ends up showing an expert swordsman, his enemies are \ndefeated easily. Catarina has difficulties and the boy helps her too.");
																									teclado.nextLine();
																									System.out.println("You: — Where did you learn to fight like that? Without you we wouldn't have \nmade it.");
																									teclado.nextLine();
																									System.out.println("Boy: — My father taught me. Can I go with you?");
																									teclado.nextLine();
																									System.out.println("You: — Of course, you are welcome. By the way, what's your name, boy?");
																									teclado.nextLine();
																									System.out.println("Boy: — My name is George and you?");
																									teclado.nextLine();
																									System.out.println("You: — "+nome+". You said George?");
																									teclado.nextLine();
																									System.out.println("George: — Yes, why? Do you know me?");
																									teclado.nextLine();
																									System.out.println("You: — After I will tell you, now we need to get out of here.");
																									teclado.nextLine();
																									System.out.println("To hear the boy's name you feel extremely happy, bythe way George \nactually was safe and sound. The feeling of guilt let your body.");
																									teclado.nextLine();
																									System.out.println("Catarina: — We need to go there.");
																									teclado.nextLine();
																									System.out.println("Catarina points to a window.");
																									teclado.nextLine();
																									System.out.println("Catarina: — A couple managed to escape through the window, we just need \nto cross the bridge.");
																									teclado.nextLine();
																									System.out.println("George: — My parents. they ran away, they couldn’t help me and left me here \nalone.");
																									teclado.nextLine();
																									System.out.println("You: — I met them, Your father was missing you.");
																									teclado.nextLine();
																									System.out.println("George: — Felt? What happened to my father tell me.");
																									teclado.nextLine();
																									System.out.println("You: — He's dead, died saving my life.");
																									teclado.nextLine();
																									System.out.println("The boy begins to whine and the grin on your face soon goes away.");
																									teclado.nextLine();
																									System.out.println("George: — You should have died instead of him.");
																									teclado.nextLine();
																									System.out.println("Henrique: — don't curse my dad.");
																									teclado.nextLine();
																									System.out.println("Catarina: — We have no time to argue, we need to continue. We're almost there.");
																									teclado.nextLine();
																									System.out.println("It is dark on top and in the way each grab a torch. On the \nbridge, she appears narrow and treacherous, with little space \nfor the feet. Any false step would result in a big drop.");
																									teclado.nextLine();
																									System.out.println("You: — Move slowly.");
																									teclado.nextLine();
																									System.out.println("Isabella: — Father I can't, I'm afraid.");
																									teclado.nextLine();
																									System.out.println("George: — I will help you. One step after the other. Hold on to me.");
																									teclado.nextLine();
																									System.out.println("You: — Miss only you two.");
																									teclado.nextLine();
																									System.out.println("Almost at the end of the bridge, an arrow hits the rope and post falls, \nbeing arrested only on one side. George can hold what is left of the bridge and Isabella grabs George's foot \nand put the torch, starting a fire downstairs \nwhen the barrels.");
																									teclado.nextLine();
																									System.out.println("George: — Hold on, I'm almost to the top.");
																									teclado.nextLine();
																									System.out.println("Isabella: — no George, if I continue holding on to your feet we \nboth fall. Goodbye, father, mother, and Henrique, I love you.");
																									teclado.nextLine();
																									System.out.println("Isabella loose George, hits the ground and disappear among the flames");
																									teclado.nextLine();
																									System.out.println("You: — daughter. My God, can't be.");
																									teclado.nextLine();
																									System.out.println("1. Go down and try to help her daughter. \n2. Continue.");
																									options=teclado.nextInt();
																									if(options==1){
																										teclado.nextLine();
																										System.out.println("You descend to the ground the bridge caved in. Getting there Isabella is \nUnconscious and the fire burns on your legs. You find a bucket of dirty \nwater and don't think twice, it turns out his daughter's legs to put out the \nfire that consumed half the meat.");
																										teclado.nextLine();
																										System.out.println("When you throw the water the fire goes off in a terrifying hiss. The flames are \nrising more and more, ceiling woods fall and you drag your daughter out of the \ntower through the main gate that was left open while fleeing.");
																										teclado.nextLine();
																										System.out.println("Outside the tower you lay your daughter on the ground.");
																										teclado.nextLine();
																										System.out.println("Person: - You started the fire and deserve to die.");
																										teclado.nextLine();
																										do {
																											pontof= escolhe.nextInt(4)+1;
																											System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
																											ataque = teclado.nextInt();
																											if (ataque == pontof) {
																												vidam = vidam-50;
																												System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
																											} else {
																												vidap = vidap-25;
																												System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
																											}
																										} while (vidap > 0 && vidam > 0);
																										if(vidap > 0){
																											System.out.println("You defeat the enemy and recovered your life!\n");
																											vidap = 100;
																											vidam = 100;
																											teclado.nextLine();
																											System.out.println("After defeating him you address to his daughter.");
																											teclado.nextLine();
																											System.out.println("You: — Daughter wake up, you're safe. Isabella, answer. Stay with me please.");
																											teclado.nextLine();
																											System.out.println("You put your head against Isabella's chest and memories of her childhood \npass through your head.");
																											teclado.nextLine();
																											System.out.println("Isabella:- 'Dad, look, I made this picture for you.'");
																											teclado.nextLine();
																											System.out.println("'I love you daddy, you're my hero.'");
																											teclado.nextLine();
																											System.out.println("You: — I love you too, daughter. Go with God.");
																											teclado.nextLine();
																											System.out.println("You feel a weakness and a pain in the belly, the enemy hurt you badly and much blood was lost.");
																											teclado.nextLine();
																											System.out.println("Isabella: — Father ...");
																											teclado.nextLine();
																											System.out.println("You: — Daughter you are aliv...");
																											teclado.nextLine();
																											System.out.println("On account of the injury you erase and later wake up with the sound of wheels.");
																											teclado.nextLine();
																											System.out.println("You: — Where am I?");
																											teclado.nextLine();
																											System.out.println("George: — It was time to wake up. I took care of his injury, but I could not do \nanything for Isabella.");
																											teclado.nextLine();
																											System.out.println("You: — She's ...");
																											teclado.nextLine();
																											System.out.println("George: — Dead? No, she's right there in the other wagon being pulled by her wife. We're \ngoing to my mother's house, not far from here.");
																											teclado.nextLine();
																											System.out.println("You: — I'm going to walk from here, I want to see my daughter.");
																											teclado.nextLine();
																											System.out.println("Catarina: — She has not woken up since we left, she will have to amputate \nthem.");
																											teclado.nextLine();
																											System.out.println("You: - We will take good care of you daughter. Let's get her to Kandarim.");
																											teclado.nextLine();
																											System.out.println("George: — Here we are.");
																											teclado.nextLine();
																											System.out.println("Upon entering the house, the furniture is all turned upside down as if a \nhurricane had passed by. A red liquid catches George's attention. As you \napproach, you find his mother dead with a cut throat.");
																											teclado.nextLine();
																											System.out.println("George: — Mother, it cannot be.");
																											teclado.nextLine();
																											System.out.println("You: — Come on George, they may be after us.");
																											teclado.nextLine();
																											System.out.println("George: — Go where? This is my only home.");
																											teclado.nextLine();
																											System.out.println("You: — There's space in my house for one more. If you want of course");
																											teclado.nextLine();
																											System.out.println("George: — Yes, I accept dad.");
																											teclado.nextLine();
																											System.out.println("You: — Dad?");
																											teclado.nextLine();
																											System.out.println("George: — Sorry I got carried away a little.");
																											teclado.nextLine();
																											System.out.println("You: — You can call me father, 'son'.");
																											teclado.nextLine();
																											System.out.println("Hours of travel, you finally arrive at King Arthur's castle.");
																											teclado.nextLine();
																											elf();
																										}else{
																											teclado.nextLine();
																											System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																											teclado.nextLine();
																											vidap = 100;
																											vidam = 100;
																										}
																									}else{
																										teclado.nextLine();
																										System.out.println("You jump out a window and falls directly into a wagon one thing you think about \nis your daughter and not see an enemy sword cutting off your head.");
																										teclado.nextLine();
																										System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																										teclado.nextLine();
																									}
																								}else{
																									teclado.nextLine();
																									System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																									teclado.nextLine();
																									vidap = 100;
																									vidam = 100;
																								}	
																							}else{
																								teclado.nextLine();
																								System.out.println("You are in a hurry and didn’t help the poor kid, a way out must \nbe found, the main gate is locked.");
																								teclado.nextLine();
																								System.out.println("You go to the Armory and you and your family get armed with shields and \nswords.");
																								teclado.nextLine();
																								System.out.println("You go to the next floor, there some enemies were waiting. Isabella is low and \nlittle Henrique is too young to know how to use a sword, the battle ends up \nbeing between you and Catarina against four others.");																							
																								teclado.nextLine();
																								System.out.println("A help would be very welcome, maybe if you had helped the boy");
																								teclado.nextLine();
																								System.out.println("Enemies leave up to you. The battle ends up showing a massacre, \nonly one enemy was killed, his family nobody remained.");
																								teclado.nextLine();
																								System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																							}	
																						}				
																					}
																				}else{
																					teclado.nextLine();
																					System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																					teclado.nextLine();
																					vidap = 100;
																					vidam = 100;
																				}					
																			}else{
																				teclado.nextLine();
																				System.out.println("You run toward the cremation room, on the way you run into a woman \nchained. Inside you hide behind the furnace, where something burns.");
																				teclado.nextLine();
																				System.out.println("When the siren stops, you feel it's time to leave, but when you try to open the \ndoor it does not open, when you closed the door the latch came down. You \nlook for the key, but you do not find it, in the bump you must have lost it.");
																				teclado.nextLine();
																				System.out.println("The smoke from the furnace takes over the entire room and you soon run out of \noxygen.");
																				teclado.nextLine();
																				System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																				teclado.nextLine();
																			}
																		}
																	}else{
																		teclado.nextLine();
																		System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																		teclado.nextLine();
																		vidap = 100;
																		vidam = 100;
																	}
																}else{
																	teclado.nextLine();
																	System.out.println("You decide not to attack, but in the top of the Tower a lookout just spotting you \nand fire sirens. The enemies are around, you have no chance and does \nabsolutely nothing. The Red Commander takes his life with the hatchet. ");
																	teclado.nextLine();
																	System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
																	teclado.nextLine();
																}
															}
														}else{
															teclado.nextLine();
															System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
															teclado.nextLine();
															vidap = 100;
															vidam = 100;
														}
													}else{
														teclado.nextLine();
														System.out.println("You try to escape, but the sound of your footsteps draws attention of all and ends up being caught and killed.");
														teclado.nextLine();
														System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
														teclado.nextLine();
													}
												}else{
													System.out.println("It doesn’t necessary much time for the rain to start a combustion in your bodies \nburning completely  your  flesh. His ashes are now part of Misthalin.");
													teclado.nextLine();
													System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
													teclado.nextLine();
												}
											}
										}else{
											teclado.nextLine();
											System.out.println("You: — The answer is no, I already have more to worry about ");
											teclado.nextLine();
											System.out.println("Sir: — Disamerd this way , you don’t  go very far, I on the other hand I was willing \nto lend  one of my swords. Now get out of here, selfish.\nYou encounter an enemy on the way, as you are disarmed your damage is \nonly 5. Attack.");
											teclado.nextLine();
											do {
												pontof= escolhe.nextInt(4)+1;
												System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
												ataque = teclado.nextInt();
												if (ataque == pontof) {
													vidam = vidam-50;
													System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
												} else {
													vidap = vidap-25;
													System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
												}
											} while (vidap > 0 && vidam > 0);
											if(vidap > 0){
												System.out.println("You defeat the enemy, but you not have recovered your life!\n");
												vidap = 100;
												vidam = 100;
												teclado.nextLine();
												System.out.println("When defeated the enemy emits a shrill sound, which ends up attracting the \nattention of the others who were near. You realizeyou don't have any chance \nat all and just accept death..");
												teclado.nextLine();
												System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
												teclado.nextLine();
											}else{
													teclado.nextLine();
													System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
													teclado.nextLine();
													vidap = 100;
													vidam = 100;
												}
											}
										}
									}else{
										System.out.println("You are surprised by an enemy, being unarmed you don’t have the chance to \ndefend yourself and you are hit in the heart");
										teclado.nextLine();
										System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
										teclado.nextLine();
									}	
								}else{
									teclado.nextLine();
									System.out.println("You find an enemy on the way, as you're disarmed your damage \nit is only 5. Attack.");
									teclado.nextLine();
									do {
										pontof= escolhe.nextInt(4)+1;
										System.out.println("Choose where you want to attack: \n1. Head   2. Body\n3. Arms   4. Legs");
										ataque = teclado.nextInt();
										if (ataque == pontof) {
											vidam = vidam-50;
											System.out.println("You hit the attack and gave 50 damage! \nHP of the enemy: " +vidam+ "/100\n");
										} else {
											vidap = vidap-25;
											System.out.println("You missed the attack and lost 25HP\nHP: " +vidap+ "/100\n");
										}
									} while (vidap > 0 && vidam > 0);
									if(vidap > 0){
										System.out.println("You defeat the enemy and recovered your life!\n");
										vidap = 100;
										vidam = 100;
										teclado.nextLine();
										System.out.println("When defeated the enemy emits a screeching sound, which ends up calling the \nattention of others who were nearby. You realize you don't stand a \nchance against all and only accepts death.");
										teclado.nextLine();
										System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
										teclado.nextLine();
									}else{
										teclado.nextLine();
										System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
										teclado.nextLine();
										vidap = 100;
										vidam = 100;
									}
								}
							}else{
								teclado.nextLine();
								System.out.println("Isabella is weak to run, you come back to help, but an arrow has hit her head. \nThe enemies have only one archer, the time to put another arrow in the bow is \n2 seconds, which proves necessary for Catarina and Henrique to escape to \nkill the inside.");
								teclado.nextLine();
								System.out.println("|====================|\n|     You died!      |\n|     GAME OVER      |\n|====================|\n");
								teclado.nextLine();
							}
						}
					}
				}else{
					teclado.nextLine();
					System.out.println("Taken by anger and hatred, you decide to follow your \njourney alone without communicating your family, who wasn't \naware of anything.");
					teclado.nextLine();
					elf();
				}
			}if (menu == 2) {
				System.out.println("|==== OPTIONS ====|\n| 1. Language     |\n| 2. Back         |\n|=================|");
				options = teclado.nextInt();
				if (options == 1) {
					System.out.println("|====== LANGUAGE ======|\n| 1. EN-US             |\n| 2. PT-BR             |\n|                      |\n| 3. Back              |\n|======================|");
					options = teclado.nextInt();
					if (options == 2) {
						System.out.println("Modificado para Português\n");
//### PT-BR ##########################################################
						do {
							System.out.println("|====================|\n|      A ESPADA      |\n|         DA         |\n|      VINGANÇA      |\n|====================|");
							System.out.println("|======= MENU =======|\n| 1. Novo Jogo       |\n| 2. Opções          |\n| 3. Sair            |\n|====================|");
							menu = teclado.nextInt();							
//### INICIO DO JOGO ##################################################
							if (menu == 1) {
								System.out.println("Escolha um nome para o personagem: ");
								nome= teclado.next();
								teclado.nextLine();
								System.out.println("Para continuar pressione enter...");
								teclado.nextLine();
								System.out.println("Época de vendas, "+nome+", filho de uma família simples que morava no interior, cuja sua \ninfância foi marcada pelo assassinato de sua mãe que morreu em uma batalha, \nlutando pelo seu povo no Reino de Misthalin, é enviado a cidade para vender lã e ajudar sua família. No \ncaminho, escuta pessoas comentando sobre o retorno de um feiticeiro maligno, \nBalthazar.");
								teclado.nextLine();
								System.out.println("O feiticeiro maligno era conhecido no seu povo como o destruidor dos povos, pois \nqualquer povo que entrava em guerra com o seu, virava cinzas, devido a sua magia \nextremamente destruidora e assustadora.");
								teclado.nextLine();
								System.out.println("Ao se deparar com o nome “Balthazar”, "+nome+" relembra da história contada pelo seu pai, \ne percebe que Balthazar era quem havia matado sua mãe, o que faz ele pensar em \nnada além de vingança.");
								teclado.nextLine();
								System.out.println("Você vai ao castelo do Rei, localizado no Reino de Kandarim, em busca de informações a respeito \nde Balthazar, ele é o único que aparenta saber...");
								teclado.nextLine();
								System.out.println("Você: — Vossa Majestade, meu nome é "+nome+", e fiquei sabendo que o senhor era amigo de minha mãe \nAthena. Eu vim até aqui vender lã e no caminho ouvi que Balthazar estava de \nvolta. Como amigo, o senhor poderia esclarecer o que realmente houve com a minha \nmãe? Meu pai nunca me contou toda a história.");
								teclado.nextLine();
								System.out.println("Rei Artur: — "+nome+", é você? Eu o conheci quando ainda era um bebê, como você cresceu. Me chame \nde Artur por favor.  Bem, vamos direto ao assunto, como Misthalin era o mais \npróximo de Kandarim, eu recebi uma carta contendo um pedido de ajuda. Nela estava \nescrito que as tropas do Balthazar estavam se aproximando de Misthalin e \nprecisavam de um grande exército. Não pude recusar, presumi que se o Reino A caísse \no próximo atacado seria o meu, e como Rei meu dever é proteger meu povo, \nentão avancei rapidamente até o campo de batalha e lutei lado a lado de sua mãe \ncontra as forças do mago Balthazar.");
								teclado.nextLine();
								System.out.println("Rei Artur: — Os números estavam contra nós e enfim a \ndefesa falhou, o reino acabou em ruínas e sua mãe acabou sendo morta na minha \nfrente pelo próprio Balthazar. Ela era uma grande amiga, mas infelizmente não foi \npossível salva-lá e nem ao seu Reino, eu sinto muito garoto.");
								teclado.nextLine();
								System.out.println("Você: — Você fez o que foi necessário. Há algo que você saiba sobre o Balthazar?");
								teclado.nextLine();
								System.out.println("Rei Artur: — Por ter usado grande parte do seu poder Balthazar enfraqueceu e logo após a batalha \nsumiu por um tempo para recuperar seu poder. Há pouco tempo também ouvi rumores \nde que Balthazar estava de volta, só que mais forte e poderoso determinado a \nconcluir aquilo que começou, o domínio dos 5 Reinos. Os aliados de Balthazar \nestão por todos  os lados, tenha cuidado. Há algo aqui comigo que irá te proteger... \n\n...Rei Artur abre um baú que em seu interior revela uma espada vermelho \nsangue incrustada de jóias... \n\nRei Artur: — Essa era a espada de sua mãe, no seu leito de morte \nela me fez prometer que um dia a entregaria a você, e aqui está. Pegue.");
								teclado.nextLine();
								System.out.println("...Rei Artur atira o cabo na espada na direção de suas mãos. Você se atrapalha por um \nmomento e a deixa cair...");
								teclado.nextLine();
								System.out.println("Você: — Eu nunca peguei em uma antes, sempre vivi no interior com minha família, não faço \na mínima ideia de como usá-la.");
								teclado.nextLine();
								System.out.println("Rei Artur: — Deu pra se notar... Se você quiser estou a disposição de te ensinar alguns truques \nessenciais para sobreviver.");
								teclado.nextLine();
								System.out.println("Você: — Claro, preciso manter minha esposa e filhos a salvo.");
								teclado.nextLine();
								System.out.println("Rei Artur: — Você tem filhos, eu adoraria conhecê-los. Eu posso mantê-los a salvo aqui no meu \ncastelo se for necessário.");
								teclado.nextLine();
								System.out.println("Você: — Você está sendo muito gentil, desse jeito vou desconfiar.");
								teclado.nextLine();
								System.out.println("Rei Artur: — Haha. Sua mãe me salvou um dia, esse é meu jeito de retribuir. Vamos começar.");
								teclado.nextLine();
//### TUTORIAL DE BATALHA ###################################################
								System.out.println("\n-----------------------------------------------------------------------------------------------------------------------\nSEJA BEM-VINDO AO CAMPO DE BATALHA, AQUI VOCÊ SERÁ TREINADO PARA CONSEGUIR DERROTAR SEUS INIMIGOS DURANTE SUA AVENTURA!\n-----------------------------------------------------------------------------------------------------------------------\nEsta sua espada possui um poder muito especial, ao derrotar um inimigo você ganha forças e recupera sua vida, por isso\ntome cuidado e faça escolhas com sabedoria... Vamos começar!\n\nDica: Para derrotar o inimigo, um golpe não será o suficiente, por isso você deve escolher onde atacá-lo, se acertá-lo,\no inimigo perderá vida, caso contrário ele irá te atacar.\n(Tome cuidado pois você tem apenas 4 chances)");
								teclado.nextLine();
								do {
									pontof= escolhe.nextInt(4)+1;
									System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
									ataque = teclado.nextInt();
									if (ataque == pontof) {
										vidam = vidam-50;
										System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
									}else {
										System.out.println("Você errou! Tente novamente.\n");
									}
								} while (vidam > 0);
								System.out.println("---------------------------------------------------------------------\nTutorial concluído, agora você está pronto para iniciar sua aventura!\n---------------------------------------------------------------------\n");
								vidam = 100;
								teclado.nextLine();
								System.out.println("Rei Artur: — Muito bem garoto, você aprende rápido! Aceite esse mapa e não se \nperca no caminho de volta");
								teclado.nextLine();
//### FIM DO TUTORIAL #########################################################################
								System.out.println("Você agradece pelas informações concedidas e segue seu caminho \n1. Você deseja voltar para a casa e avisar sua familia \n2. Você deseja seguir seu caminho sozinho");
								options = teclado.nextInt();
								if (options==1){
									familia=1;
									teclado.nextLine();
									System.out.println("...chegando em casa, você conta para sua esposa Catarina que irá em busca \ndo homem que matou sua mãe e lhes levará em segurança para o castelo \ndo Rei Artur.");
									teclado.nextLine();		
									System.out.println("Quando lhe é contado, o pequeno Henrique, seu filho caçula, demonstra um \nenorme entusiasmo na “aventura” até o castelo que seguirá a seguir, mas \nalguém parece estar faltando... Você se dirige ao quarto de sua filha Isabella \ne descobre que enquanto esteve fora ela acabou adoecendo. Um dos \nmelhores médicos dos 5 Reinos se encontra em Kandarim.");
									teclado.nextLine();
									System.out.println("No caminho de volta ao castelo você encontra um caminho alternativo da \nestrada principal, com um aspecto assustar e inabitado, mas que leva metade \ndo tempo até o castelo. Você precisa ser rápido, sua filha precisa de \ncuidados médicos, faça sua decisão agora: \n1. Seguir na estrada principal \n2. Seguir no caminho alternativo");
									options = teclado.nextInt();
									if(options==1){
										teclado.nextLine();
										System.out.println("Tudo está indo bem, mas no caminho você encontra um inimigo determinado a \nmatá-los. Ataque.");
										teclado.nextLine();
										do {
											pontof= escolhe.nextInt(4)+1;
											System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
											ataque = teclado.nextInt();
											if (ataque == pontof) {
												vidam = vidam-100;
												System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
											}else {
												vidap = vidap-0;
												System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
											}
										} while (vidap > 0 && vidam > 0);
										if(vidap > 0){
											teclado.nextLine();
											System.out.println("Você derrotou o inimigo e recuperou sua vida!");
											vidap = 100;
											vidam = 100;
											teclado.nextLine();
											System.out.println("Chegando ao castelo, você descobre que o Rei Artur não se encontra. Você \ndeixa sua família sob os cuidados do mordomo do Rei e se despede.");
											teclado.nextLine();
											elfo();
										}else{
											System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
											vidap = 100;
											vidam = 100;
										}
									}else{
										System.out.println("Você e sua família escutam passos, servos de Balthazar os estão seguindo. \nVocês tentam andar rápido, mas acabam caindo em uma emboscada e são \ncercados.");
										teclado.nextLine();
										System.out.println("1. Atacar \n2. Se render\n3. Fugir");
										options= teclado.nextInt();
										if(options==1){
											System.out.println("Você tenta atacar, mas antes que tenha chance um demônio vermelho \ndecepa seu braço e o faz assistir sua família ser morta na sua frente, logo \ndepois é a sua vez.");
											teclado.nextLine();
											System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
											teclado.nextLine();
										}else{
											if(options==2){
												System.out.println("Ao se render os inimigos tomam sua espada e o atingem na cabeça deixando-o \ninconsciente. Amanhece e você acorda com o incessante som dos pássaro, \nsua família parece estar desaparecida.");
												teclado.nextLine();
												System.out.println("1. Procurar por pistas do paradeiro de sua família \n2. Continuar seu caminho até o castelo");
												options=teclado.nextInt();
												if(options==1){
													System.out.println("Você anda alguns passos até que um cheiro de carne podre toma conta do ar, \num pouco mais a frente algo parece estar balançando em uma árvore, é um \ncorpo, o cheiro parece estar vindo dele. Ao se aproximar encontra o corpo \npendurado por uma corda e com uma flecha no seu peito, você puxa a \nflecha do peito do cadáver e a examina. Feita de uma madeira parcialmente \nqueimada, você chega a conclusão que a sua família está possivelmente no \nlugar onde a flecha foi feita. Para onde você deseja ir: \n1. Misthalin; \n2. Lorien \n3. Mergonia \n4. Kandarim");
													options=teclado.nextInt();
													if(options==1){
														System.out.println("Essa foi a primeira vez que você foi a Misthalin e talvez será a ultima, há cinzas \npor todos os lados, a temperatura do ar se assemelha a um vapor e a nuvem \nde poeira não permite que o sol brilhe por aqui.");
														teclado.nextLine();
														System.out.println("Mesmo com as dificuldades que o lugar aparenta, você avista uma casa \nhabitada. Você bate na porta. TOC TOC.");
														teclado.nextLine();
														System.out.println("Senhora: - Por favor, não nos leve. Nós não temos mais nada para... Hey, você \nnão é um deles");
														teclado.nextLine();
														System.out.println("Você: - Um deles? Quem?");
														teclado.nextLine();
														System.out.println("Senhora: - Os monstros, eles levaram meu bebê. Eu e meu marido conseguimos \nfugir e desde então eles vem até aqui em busca de alimentos, caso contrário \nseremos levados de volta e meu filho será morto.");
														teclado.nextLine();
														System.out.println("Você: - Você sabe onde pra onde eles levaram seu filho? Minha família foi \nlevada a pouco tempo.");
														teclado.nextLine();
														System.out.println("Senhor: - Eu sei e posso te mostra o caminho, mas apenas se você prometer \nsalvar nosso filho.");
														teclado.nextLine();
														System.out.println("1. Aceitar ajuda \n2. Negar ajuda");
														options=teclado.nextInt();
														if(options==1){
															teclado.nextLine();
															System.out.println("Você: - Eu prometo. Agora vamos, eles não tem muito tempo.");
															teclado.nextLine();
															System.out.println("Senhor: - Espere, tenho algo aqui para você");
															teclado.nextLine();
															System.out.println("O senhor lhe entrega uma espada um pouco enferrujada, mas o que se \nmostra melhor do que nada.");
															teclado.nextLine();
															System.out.println("Você: - Obrigado, a minha foi roubada.");
															teclado.nextLine();
															System.out.println("Minutos se passam e conforme vocês avançam a temperatura aumenta.  Você \nolha pro céu e avista uma nuvem de chuva se formando, uma gota cai e \natinge seu braço, instantaneamente você sente uma sensação de \nqueimadura.");
															teclado.nextLine();
															System.out.println("Senhor: - Rápido precisamos buscar abrigo.");
															teclado.nextLine();
															System.out.println("Você: - O que é isto? Está queimando.");
															teclado.nextLine();
															System.out.println("Senhor: - As cinzas que sobem vão até as nuvens resultando em uma \nmudança de temperatura. Pra onde nós vamos? \n1.Voltar para casa do senhor \n2.Entrar na caverna ali adiante \n3.Continuar seu caminho");
															options=teclado.nextInt();
															if(options==1){
																System.out.println("A casa se encontra longe demais e não é necessário muito tempo para que a \nchuva inicie uma combustão em seus corpos queimando completamente a \ncarne de vocês. Suas cinzas são agora parte de Misthalin.");
																teclado.nextLine();
																System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																teclado.nextLine();
															}else{
																if(options==2){
																	teclado.nextLine();
																	System.out.println("Caverna adentro, horas sem comer acabam resultando em nada além de uma \ngrande fome de leão, com a chuva do lado de fora a possibilidade de \nencontrar por comida acaba se mostrando impossível. Pouco tempo depois \nna escuridão da caverna um rugido é ouvido, você pensa que é apenas a \nbarriga do senhor estando com tanta fome quanto você e volta a tentar \ndormir. ");
																	teclado.nextLine();
																	System.out.println("Senhor: — Acorde menino. Há um urso aqui, precisamos matá-lo antes que \nviremos sua refeição.");
																	teclado.nextLine();
																	System.out.println("Você da às costas ao urso por um momento para pegar sua espada e é \nderrubado, o urso fica sobre duas pernas para dar seu ataque final e acaba \nsendo atingido na barriga pelo senhor.");
																	teclado.nextLine();
																	System.out.println("Você: — Obrigado, você salvou minha vida.Você: — Obrigado, você salvou minha vida.");
																	teclado.nextLine();
																	System.out.println("Senhor: — Não agradeça, agora tire a pele desse urso, parece que arranjamos \nnosso jantar.");
																	teclado.nextLine();
																	System.out.println("Você come e recupera suas forças, a chuva para e é hora de continuar sua \njornada.");
																	teclado.nextLine();
																	System.out.println("Senhor: — Eu vou só até aqui, siga em frente mais alguns metros e você achará \nseu caminho. Salve meu filho seu nome é George, ele é um bom menino.");
																	teclado.nextLine();
																	System.out.println("Você: — Deixe comigo, seu filho vai voltar para casa são e salvo.");
																	teclado.nextLine();
																	System.out.println("Senhor: — Muito obrigado rapaz, fique com a espada eu não vou usar ela.");
																	teclado.nextLine();
																	System.out.println("De longe uma torre negra é avistada, o som de metal contra metal é ouvido. Ao \nse aproximar você vê pessoas sendo escravizadas para a construção de \nnovas espadas e armaduras e um campo de treinos do outro lado, onde \nalgumas silhuetas não identificadas treinam em combate.");
																	teclado.nextLine();
																	System.out.println("Algo faz com que o fogo da forja reflita em seu rosto, você semicerra os olhos e \ndescobre a origem do reflexo, a espada de sua mãe está nas costas de um \ndos inimigos.");
																	teclado.nextLine();
																	System.out.println("Você espera até que ele esteja sozinho e se dirige a ele sorrateiramente. \n1. Atacar de surpesa \n2. Fugir");
																	options=teclado.nextInt();
																	if(options==1){
																		teclado.nextLine();
																		System.out.println("1. O ataque de surpresa não se mostra tão eficaz, o inimigo perde apenas metade de sua vida. Acabe com ele.");
																		vidam=50;
																		do {
																			pontof= escolhe.nextInt(4)+1;
																			System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
																			ataque = teclado.nextInt();
																			if (ataque == pontof) {
																				vidam = vidam-50;
																				System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
																			}else {
																				vidap = vidap-0;
																				System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
																			}
																		} while (vidap > 0 && vidam > 0);
																		if(vidap > 0){
																			vidap = 100;
																			vidam = 100;
																			teclado.nextLine();
																			System.out.println("Você recupera a espada e sente o seu poder percorrendo seu corpo quando \nsua vida é restaurada.");
																			teclado.nextLine();
																			System.out.println("Há dois inimigos guardando a porta, enfrentá-los ao mesmo tempo será difícil, \numa forma de separá-los precisa ser pensada.");
																			teclado.nextLine();
																			System.out.println("Minutos de tocaia acaba se mostrando útil, um deles precisa aliviar a bexiga e \ndirige-se até o canto da fortaleza.");
																			teclado.nextLine();
																			System.out.println("1. Atacar o guarda \n2. Atacar o inimigo do canto \n3. Não atacar.");
																			options=teclado.nextInt();
																			if(options==1){
																				System.out.println("Você se aproxima para atacar o guarda, mas é surpreendido pelo inimigo que tinha saído e acaba tendo a espada enfiada no meio do peito.");
																				teclado.nextLine();
																				System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																				teclado.nextLine();
																			}else{
																				if(options==2){
																					teclado.nextLine();
																					System.out.println("Você se aproxima do inimigo e desfere um golpe virtuoso separando-lhe a \ncabeça do resto do corpo, ao se aproximar você nota no que restou do \npescoço do inimigo uma plaqueta de identificação com o nome ‘George’. ");
																					teclado.nextLine();
																					System.out.println("É necessário alguns segundos para processar o ato, a sua própria voz surge \nem sua cabeça: “Você prometeu salvar a vida dele, e olha o que acabou de \nfazer”.");
																					teclado.nextLine();
																					System.out.println("Você cai de joelhos e abraça o corpo do morto como se fosse seu próprio filho.");
																					teclado.nextLine();
																					System.out.println("Você: — Me perdoe, eu não tinha ideia de que era você. Eu sou um monstro, \ntirei a vida de um garoto inocente.");
																					teclado.nextLine();
																					System.out.println("“Você não merece perdão, olhe nos olhos dele, ele tinha toda vida pela frente e \nfoi tirado por você. Você não passa de um egoísta que fez o que fez apenas \npara salvar a vida da sua família e não pensou nos outros prejudicados”.");
																					teclado.nextLine();
																					System.out.println("Lágrimas escorrem pelo seu rosto, passos são ouvidos vindos de suas costas, \nmas você não liga.");
																					teclado.nextLine();
																					System.out.println("Ouve-se uma espada sendo desembainhada, você não faz esforço algum para \nse defender, sente que a sua vida deve ser tirada pelo erro que acabou de \ncometer. Pelo canto do olho você vê o inimigo pondo a espada no alto para \ndesferir-lhe um ataque mortal.");
																					teclado.nextLine();
																					System.out.println("Senhor: — Fuja "+nome+", eu cuido dele.");
																					teclado.nextLine();
																					System.out.println("Você está sem chão e não entende o que está ocorrendo sua frente.");
																					teclado.nextLine();
																					System.out.println("O homem que mostrou-lhe o caminho está agora lutando com um dos inimigos \npara salvar sua vida. Três ataques mostram-se suficientes para partir a \nespada enferrujada do velho em duas. Logo depois a espada do inimigo entra \nno peito do pobre senhor e atravessa seu corpo, é possível ver a ponta \nensanguentada nas suas costas.");
																					teclado.nextLine();
																					System.out.println("Senhor: — Salv-ve m-meu filho.");
																					teclado.nextLine();
																					System.out.println("Suas últimas palavras servem para te trazer de volta a vida real. Você põe-se \nem pé, pega a espada e parte para o ataque. ");
																					teclado.nextLine();
																					do {
																						pontof= escolhe.nextInt(4)+1;
																						System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
																						ataque = teclado.nextInt();
																						if (ataque == pontof) {
																							vidam = vidam-50;
																							System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
																						}else {
																							vidap = vidap-0;
																							System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
																						}
																					} while (vidap > 0 && vidam > 0);
																					if(vidap > 0){
																						teclado.nextLine();
																						System.out.println("Você derrotou o inimigo e recuperou sua vida!");
																						vidap = 100;
																						vidam = 100;
																						teclado.nextLine();
																						System.out.println("Mesmo depois de morto você continua golpeando o inimigo inúmeras vezes \ndescontando toda sua raiva. Sangue escorre por todos os lados, e cobre sua \ncara de vermelho.");
																						teclado.nextLine();
																						System.out.println("Algo preso na cintura do inimigo tira sua atenção, um molho contendo chaves \nde todos os tipos, tamanhos e formas. Você acaba de encontrar uma forma \nde entra na torre.");
																						teclado.nextLine();
																						System.out.println("Você deduz que a chave maior deve ser a certa para abrir o portão principal, o \nque se mostra correto quando o portão se abre com um forte rangido de \ndobradiças que não vêem óleo a séculos.");	
																						teclado.nextLine();
																						System.out.println("Dentro da torre, ela acaba se mostrando de um tamanho assustador, salas e \nsalas por todos os lados e escadas para todas as direções.");	
																						teclado.nextLine();
																						System.out.println("Alguém solta um grunhido, você olha na direção do som e vislumbra uma \npessoa amarrada a um poste sendo chicoteada. A coisa que segura o chicote \né familiar a você, o demônio vermelho que ajudou na captura de sua família. \nLogo depois de terminar com as chicotadas ele se retira, você tenta segui-lo, \nmas no caminho derruba uma caixa que faz um grande estrondo e chama a \natenção de todos para você.Sirenes tocam e o portão principal é fechado por \nfora com o intuito de mantê-lo sem saída, você precisa arranjar um \nesconderijo antes que seja pego. Há 3salas, escolha uma.");	
																						teclado.nextLine();
																						System.out.println("1. Esconder-se na câmara de refrigeração \n2. Esconder-se no depósito de corpos \n3. Esconder-se na sala de cremação");	
																						options=teclado.nextInt();
																						if(options==1){
																							System.out.println("Você entra na sala de refrigeração e fecha a porta, mas o que você não sabia é \nque ela pode ser aberta apenas pelo lado de fora. Seu corpo começa esfriar \ne logo você congela até a morte. ");	
																							teclado.nextLine();
																							System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																							teclado.nextLine();
																						}else{
																							if(options==2){
																								System.out.println("Ao entrar na sala, você tem uma visão nada agradável,  dezenas de corpos \nestão empilhados contra a parede direita a espera da liberação da câmara de \ncremação.Insetos de todos os tipo devoram a carne, há corpos que \naparentam estar a dias ali, com seus ossos a mostra.");	
																								teclado.nextLine();
																								System.out.println("Você se deita e coloca corpos sobre o seu para não ser encontrado.");	
																								teclado.nextLine();
																								System.out.println("Alguém entra na sala:");	
																								teclado.nextLine();
																								System.out.println("Pessoa1: — Ele não viria pra cá, nem eu aguento esse cheiro horrível.");	
																								teclado.nextLine();
																								System.out.println("Pessoa2: — O comandante nos mandou aqui, precisamos procurar.");	
																								teclado.nextLine();
																								System.out.println("Alguns corpos são tirados do lugar, mas assim que a sirene para de tocar eles \nencerram a procura.");	
																								teclado.nextLine();
																								System.out.println("Pessoa1: — Acharam ele?");	
																								teclado.nextLine();
																								System.out.println("Pessoa3: — Sim, ele estava lá fora o tempo todo. Foi morto por um de nossos \nguardas.");	
																								teclado.nextLine();
																								System.out.println("Pessoa1: — Lá fora? Mas nós o trancamos aqui.");	
																								teclado.nextLine();
																								System.out.println("Pessoa3: — Ele deve ter fugido por algum lugar.");	
																								teclado.nextLine();
																								System.out.println("Pessoa2: — Vamos trazer o corpo.");	
																								teclado.nextLine();
																								System.out.println("O morto é colocado próximo a você, o pai de George salvou novamente sua \nvida mesmo após ter perdido a dele.");	
																								teclado.nextLine();
																								System.out.println("Ao sair da sala, tudo parece ter voltado ao normal. Você passa na frente da \numa porta e dormindo lá dentro está o demônio vermelho, pelo tamanho da \nsala ele parecer ser o comandante. Ele ouve seus passos e parte pra cima de \nvocê. Lute.");	
																								teclado.nextLine();
																								do {
																									pontof= escolhe.nextInt(4)+1;
																									System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
																									ataque = teclado.nextInt();
																									if (ataque == pontof) {
																										vidam = vidam-50;
																										System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
																									}else {
																										vidap = vidap-0;
																										System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
																									}
																								} while (vidap > 0 && vidam > 0);
																								if(vidap > 0){
																									teclado.nextLine();
																									System.out.println("Você derrota o demônio, mas o deixa vivo, ele terá outras utilidade.");
																									vidap = 100;
																									vidam = 100;
																									teclado.nextLine();
																									System.out.println("Você amarra o demônio na cadeira e começa a torturá-lo para saber onde sua \nfamília se encontra.");
																									teclado.nextLine();
																									System.out.println("Você: — Onde está minha família? Você os sequestrou, eu estava lá.");	
																									teclado.nextLine();
																									System.out.println("Demônio: —Todo dia, pessoas são trazidas pra cá, você acha mesmo que eu lembro de você e sua família?");	
																									teclado.nextLine();
																									System.out.println("Você corta um dos dedos dele lentamente com uma faca de cozinha.");	
																									teclado.nextLine();
																									System.out.println("Você: — Minha filha está doente e precisa de cuidados médicos. Onde está \nminha família? Responda seu maldito.");	
																									teclado.nextLine();
																									System.out.println("Demônio: — Então você é o pai daquela doentinha? Hahaha. Ela está morta, \nteve que ser sacrificada e serviu de banquete para mim.");	
																									teclado.nextLine();
																									System.out.println("A tortura parece estar se mostrando ineficaz, é hora de pegar pesado.Você \npega a lâmpada a óleo na parede e despeja o líquido na cara dele.");
																									teclado.nextLine();
																									System.out.println("Demônio: — Ela tinha um gosto delicioso, hmmm nunca comi nada igual, estou \nadorando o banho.");
																									teclado.nextLine();
																									System.out.println("Você: — Diga-me onde está minha família ou você morre.");
																									teclado.nextLine();
																									System.out.println("Demônio: — Mortos. Estão todos mortos, seu pequeno gritou tanto na hora em \nque o comemos vivo.");
																									teclado.nextLine();
																									System.out.println("Ele não serve pra nada. \n1. Deixá-lo vivo \n2. Matá-lo");
																									options=teclado.nextInt();
																									if(options==1){
																										teclado.nextLine();
																										System.out.println("Você deixa a sala e continua a procura por sua família na torre, algo na história \ndo demônio não parecia verdade, ele hesitou demais, sua família tem \nchances de estar viva.");
																										teclado.nextLine();
																										partedemonio();
																										teclado.nextLine();
																										System.out.println("Você escuta o som de algo voando no ar, ao se virar um machado acerta sua \ncabeça.");
																										teclado.nextLine();
																										System.out.println("Demônio: — Você deveria ter me matado quanto teve chance.");
																										teclado.nextLine();
																										System.out.println("Henrique:— Papai, deixa de brincadeira, eu estou vendo você de olhos \nabertos.");
																										teclado.nextLine();
																										System.out.println("Catarina toma Henrique em seus braços e desaba a chorar.");
																										teclado.nextLine();
																										System.out.println("Henrique: — Mamãe o que foi? O papai está só brincando não está? Papai?");
																										teclado.nextLine();
																										System.out.println("Henrique percebe o que acabou de acontecer na sua frente e foge dos braços \nde sua mãe para chorar no canto da cela.");
																										teclado.nextLine();
																										System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																										teclado.nextLine();
																									}else{
																										teclado.nextLine();
																										System.out.println("Após matá-lo você deixa a sala e continua a procura por sua família na torre, \nalgo na história do demônio não parecia verdade, ele hesitou demais, sua \nfamília tem chances de estar viva.");
																										teclado.nextLine();
																										partedemonio();
																										teclado.nextLine();
																										System.out.println("Catarina: —  Você nos achou, graças a Deus. Isabella está muito doente, \nprecisamos sair logo daqui.");
																										teclado.nextLine();
																										System.out.println("Você: — Vou tirá-los daí estou procurando a chave com o número da cela.");
																										teclado.nextLine();
																										System.out.println("Você encontrou 3 chaves com o número correspondente, escolha sabiamente, \nos inimigos estão próximos de você.");
																										teclado.nextLine();
																										System.out.println("1. Escolher chave circular \n2. Escolher chave quadrada \n3. Escolher chave triangular.");
																										options=teclado.nextInt();
																										if(options==1){
																											System.out.println("Você testa a chave mas ela se mostra incorreta, ao tentar trocar de chave você \nacaba sendo atingido por um machado diretamente nas costas.");
																											teclado.nextLine();
																											System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																											teclado.nextLine();
																										}else{
																											if(options==2){
																												System.out.println("Você testa a chave mas ela se mostra incorreta, ao tentar trocar de chave você \nacaba sendo atingido por um machado diretamente nas costas.");
																												teclado.nextLine();
																												System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																												teclado.nextLine();
																											}else{
																												teclado.nextLine();
																												System.out.println("A porta faz um pequeno barulho quando a chave correta abre a porta. ");
																												teclado.nextLine();
																												System.out.println("Você: — Vamos rápido eles estão logo ali.");
																												teclado.nextLine();
																												System.out.println("Na sala ao sala há um menino solitário que o pede ajuda.");
																												teclado.nextLine();
																												System.out.println("Menino: — Ei senhor, me tire daqui por favor, minha mãe está me esperando.");
																												teclado.nextLine();
																												System.out.println("1.Não ajudar. \n2.Ajudar o menino  ");
																												options=teclado.nextInt();
																												if(options==1){
																													teclado.nextLine();
																													System.out.println("Você está com pressa e não ajuda o pobre garoto, uma saída precisa ser \nachada, o portão principal está trancado.");
																													teclado.nextLine();
																													System.out.println("Vocês se dirigem a sala de armas e sua família se arma com escudos e \nespadas.");
																													teclado.nextLine();
																													System.out.println("Vocês vão até o próximo andar, lá alguns inimigos estavam a espera. Isabella \nestá fraca e o pequeno Henrique é novo demais para saber usar uma \nespada, a batalha acaba sendo entre você e Catarina contra outros quatro.");
																													teclado.nextLine();
																													System.out.println("Uma ajuda seria muito bem-vinda, talvez se você tivesse ajudado o garoto");
																													teclado.nextLine();
																													System.out.println("Os inimigos partem para cima de vocês. A batalha acaba se mostrando um massacre, apenas um inimigo foi morto, de sua família ninguém restou.");
																													teclado.nextLine();
																													System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																													teclado.nextLine();
																												}else{
																													teclado.nextLine();
																													System.out.println("Você atira a chave ao garoto e continua a procura de uma saída, o portão \nprincipal está trancado.");
																													teclado.nextLine();
																													System.out.println("Alguém atira um machado que passa raspando por você, um segundo a mais e \nvocê estaria morto.");
																													teclado.nextLine();
																													System.out.println("Vocês se dirigem a sala de armas e sua família se arma com escudos e \nespadas.");
																													teclado.nextLine();
																													System.out.println("Vocês vão até o próximo andar, lá alguns inimigos estavam a espera. Isabella \nestá fraca e o pequeno Henrique é novo demais para saber usar uma \nespada, a batalha acaba sendo entre você e Catarina contra outros quatro. \nNa sua cabeça você pensa que a batalha está perdida, mas uma ajuda \ninesperada acaba dando novas esperanças.");
																													teclado.nextLine();
																													System.out.println("Menino: — Você salvou a minha vida, agora é minha vez de retribuir. Eu cuido \ndesses dois aqui.");
																													teclado.nextLine();
																													do {
																														pontof= escolhe.nextInt(4)+1;
																														System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
																														ataque = teclado.nextInt();
																														if (ataque == pontof) {
																															vidam = vidam-100;
																															System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
																														}else {
																															vidap = vidap-0;
																															System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
																														}
																													} while (vidap > 0 && vidam > 0);
																													if(vidap > 0){
																														teclado.nextLine();
																														System.out.println("Você derrotou o inimigo e recuperou sua vida!");
																														vidap = 100;
																														vidam = 100;
																														teclado.nextLine();
																														System.out.println("O menino acaba se mostrando um exímio espadachim, seus inimigos são \nderrotados facilmente. Catarina tem dificuldades e o menino a ajuda também.");
																														teclado.nextLine();
																														System.out.println("Você: — Onde você aprendeu a lutar desse jeito? Sem você não teríamos \nconseguido.");
																														teclado.nextLine();
																														System.out.println("Menino: — Meu pai me ensinou. Posso ir com vocês.");
																														teclado.nextLine();
																														System.out.println("Você: — Claro, você é muito bem-vindo. A propósito, qual é seu nome menino?");
																														teclado.nextLine();
																														System.out.println("Menino: — Eu me chamo George e você?");
																														teclado.nextLine();
																														System.out.println("Você: — "+nome+". Você disse George? ");
																														teclado.nextLine();
																														System.out.println("George: — Sim, por quê? Você me conhece?");
																														teclado.nextLine();
																														System.out.println("Você: — Havia um guarda com o mesmo nome que o seu.");
																														teclado.nextLine();
																														System.out.println("Ao ouvir o nome do garoto você sente-se extremamente feliz, pelo jeito George \nna verdade estava são e salvo. O sentimento de culpa deixa seu corpo. ");
																														teclado.nextLine();
																														System.out.println("George: — Sim, ele roubou minha plaqueta quando eu fui trazido pra cá.");
																														teclado.nextLine();
																														System.out.println("Catarina: — Precisamos ir pra lá.");
																														teclado.nextLine();
																														System.out.println("Catarina aponta pra uma janela nos andares superiores.");
																														teclado.nextLine();
																														System.out.println("Catarina: — Um casal conseguiu fugir por aquela janela, só precisamos \natravessar a ponte.");
																														teclado.nextLine();
																														System.out.println("George: — Foram os meus pais. Foram eles que fugiram, não puderam me \najudar e me deixaram aqui sozinho.");
																														teclado.nextLine();
																														System.out.println("Você: — Eu os conheci, seu pai sentia sua falta...");
																														teclado.nextLine();
																														System.out.println("George: — Sentia? O que aconteceu com o meu pai diga-me.");
																														teclado.nextLine();
																														System.out.println("Você: — Ele está morto, morreu salvando minha vida.");
																														teclado.nextLine();
																														System.out.println("O garoto começa a choramingar e o sorriso estampado no seu rosto logo vai \nembora.");
																														teclado.nextLine();
																														System.out.println("George: — Você deveria ter morrido no lugar dele .");
																														teclado.nextLine();
																														System.out.println("Henrique: — Não xingue meu papai.");
																														teclado.nextLine();
																														System.out.println("Catarina: — Não há tempo para discussões, precisamos continuar. Estamos \nquase lá. ");
																														teclado.nextLine();
																														System.out.println("Está escuro na parte de cima e no caminho cada um pega uma tocha. Sobre a \nponte ela se mostra estreita e traiçoeira, com pouco espaço para os \npés.Qualquer passo em falso resultaria em uma grande queda.");
																														teclado.nextLine();
																														System.out.println("Você: — Andem devagar e com calma.");
																														teclado.nextLine();
																														System.out.println("Isabella: — Pai eu não consigo, estou com medo.");
																														teclado.nextLine();
																														System.out.println("George: — Eu te ajudo. Uma passo depois do outro, assim mesmo. Segure-se \nem mim.");
																														teclado.nextLine();
																														System.out.println("Você: — Só faltam vocês.");
																														teclado.nextLine();
																														System.out.println("Quase no final da ponte, uma flecha atinge a corda e a ponte despenca, \nestando presa apenas em um lado. George consegue segurar no que restou \nda ponte e Isabella agarra-se no pé de George e larga a tocha, começando \num incêndio lá em baixo ao atingir os barris de bebida.");
																														teclado.nextLine();
																														System.out.println("George: — Segure firme, estou quase chegando ao topo.");
																														teclado.nextLine();
																														System.out.println("Isabella: — Não George, se eu continuar segurando em seus pés vamos os \ndois cair. Adeus pai, mãe e Henrique, amo vocês.");
																														teclado.nextLine();
																														System.out.println("Isabella solta George, atinge o chão e some dentre as chamas.");
																														teclado.nextLine();
																														System.out.println("Você: — Filha, não. O meu Deus, não pode ser.");
																														teclado.nextLine();
																														System.out.println("1. Descer e tentar ajudar sua filha. \n2. Continuar");
																														options=teclado.nextInt();
																														if(options==1){
																															teclado.nextLine();
																															System.out.println("Você desce até o chão pela ponte arrebentada. Chegando lá Isabella está \ndesacordada e o fogo arde em suas pernas. Você encontra um balde de \nágua suja e não pensa duas vezes, despeja nas pernas de sua filha para \napagar o fogo que consumiu metade da carne.");
																															teclado.nextLine();
																															System.out.println("Ao jogar a água o fogo se apaga em um silvo aterrorizador. As chamas estão \nsubindo cada vez mais, madeiras do teto caem e você arrasta sua filha para \nfora da torre pelo portão principal que foi deixado aberto ao fugirem.");
																															teclado.nextLine();
																															System.out.println("Fora da torre você deita sua filha no chão. ");
																															teclado.nextLine();
																															System.out.println("Pessoa: — Você começou o incêndio e merece morrer.");
																															teclado.nextLine();
																															System.out.println("LUTE");
																															teclado.nextLine();
																															do {
																																pontof= escolhe.nextInt(4)+1;
																																System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
																																ataque = teclado.nextInt();
																																if (ataque == pontof) {
																																	vidam = vidam-100;
																																	System.out.println("Você acertou o ataque e deu 50 de dano!\nHP do inimigo: " +vidam+ "/100\n");
																																}else {
																																	vidap = vidap-0;
																																	System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
																																}
																															} while (vidap > 0 && vidam > 0);
																															if(vidap > 0){
																																teclado.nextLine();
																																System.out.println("Você derrotou o inimigo e recuperou sua vida!");
																																vidap = 100;
																																vidam = 100;
																																teclado.nextLine();
																																System.out.println("Após derrotá-lo você se dirige a sua filha.");
																																teclado.nextLine();
																																System.out.println("Você: — Filha acorde, você está a salvo. Isabella, responda. Fique comigo por \nfavor.");
																																teclado.nextLine();
																																System.out.println("Você põe a cabeça contra o peito de Isabella e memórias da infância dela \npassa pela sua cabeça. ");
																																teclado.nextLine();
																																System.out.println("Isabella: —“Papai olha, fiz esse desenho pra você.”");
																																teclado.nextLine();
																																System.out.println("“Te amo papai, você é meu herói.”");
																																teclado.nextLine();
																																System.out.println("Você: — Também te amo filha. Vá com Deus.");
																																teclado.nextLine();
																																System.out.println("Você se sente uma fraqueza e uma dor na barriga, o inimigo lhe feriu \ngravemente e muito sangue foi perdido.");
																																teclado.nextLine();
																																System.out.println("Isabella: — Pai... ");
																																teclado.nextLine();
																																System.out.println("Você: — Filha você está vi...");
																																teclado.nextLine();
																																System.out.println("Por conta do ferimento você apaga e mais tarde acorda com o som de rodas.");
																																teclado.nextLine();
																																System.out.println("Você: — Onde estou?");
																																teclado.nextLine();
																																System.out.println("George: — Já era hora de acordar. Eu cuidei de seu ferimento, mas não pude \nfazer nada pela Isabella.");
																																teclado.nextLine();
																																System.out.println("Você: — Ela está...");
																																teclado.nextLine();
																																System.out.println("George: — Morta? Não, ela está logo ali na outra carroça sendo puxada por \nsua mulher. Estamos indo até a casa de minha mãe, não é longe daqui.");
																																teclado.nextLine();
																																System.out.println("Você: — Vou ir andando a partir daqui, quero ver minha filha.");
																																teclado.nextLine();
																																System.out.println("Catarina: — Ela não acordou desde que saímos de lá, ela terá que amputá-las.");
																																teclado.nextLine();
																																System.out.println("Você: — Vamos cuidar bem de você filha. Vamos levá-la a Kandarim.");
																																teclado.nextLine();
																																System.out.println("George: — Chegamos.");
																																teclado.nextLine();
																																System.out.println("Ao entrar na casa, os móveis estão todos revirados como se um furacão \ntivesse passado por ali. Um líquido vermelho chama a atenção de George. \nQuando se aproximam, vocês encontram a mãe dele morta com a garganta \ncortada.");
																																teclado.nextLine();
																																System.out.println("George: — Mãe, não pode ser.");
																																teclado.nextLine();
																																System.out.println("Você: — Eu sinto muito George. Temos que ir, eles podem estar atrás de nós.");
																																teclado.nextLine();
																																System.out.println("George: — Ir onde? Essa aqui é minha única casa.");
																																teclado.nextLine();
																																System.out.println("Você: — Há espaço na minha casa para mais um. Se você quiser é claro.");
																																teclado.nextLine();
																																System.out.println("George: — Sim eu aceito pai.");
																																teclado.nextLine();
																																System.out.println("Você: — Pai?");
																																teclado.nextLine();
																																System.out.println("George: — Desculpe me empolguei um pouco.");
																																teclado.nextLine();
																																System.out.println("Você: — Pode me chamar de pai, eu adoraria ter mais um filho");
																																teclado.nextLine();
																																System.out.println("Horas de viagem, vocês finalmente chegam ao castelo do Rei Artur. Chegando \nlá, você descobre que o Rei Artur não se encontra. Você deixa sua família \nsob os cuidados do mordomo do Rei e se despede.");
																																teclado.nextLine();
																																elfo();
																															}else{
																																teclado.nextLine();
																																System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																																vidap = 100;
																																vidam = 100;
																																teclado.nextLine();
																															}
																														}else{
																															teclado.nextLine();
																															System.out.println("Você pula a janela e cai diretamente em uma carroça, a única coisa que \nvocê pensa é na sua filha e não vê a espada do inimigo cortando sua cabeça.");
																															teclado.nextLine();
																															System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");											
																															teclado.nextLine();
																														}
																													}else{
																														System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																														vidap = 100;
																														vidam = 100;
																													}
																																				
																												}
																											}
																										}
																									}
																								}else{
																									System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																									vidap = 100;
																									vidam = 100;
																								}		
																							}else{
																								System.out.println("Você corre em direção a sala de cremação, no caminho esbarra em uma \nmulher acorrentada. Lá dentro você se esconde atrás da fornalha, onde algo \nqueima.");
																								teclado.nextLine();
																								System.out.println("Quando a sirene para, você sente que é hora de sair, mas ao tentar abrir a \nporta ela não se abre, quando você fechou a porta a trava desceu.Você \nprocura a chave, mas não a encontra, no esbarrão você deve tê-la perdido.");
																								teclado.nextLine();
																								System.out.println("A fumaça da fornalha toma conta da sala inteira e você logo acaba ficando sem \noxigênio.");
																								teclado.nextLine();
																								System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																								teclado.nextLine();
																							}
																						}																						
																					}else{
																						System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																						vidap = 100;
																						vidam = 100;
																					}
																				}else{																				
																					teclado.nextLine();
																					System.out.println("Você decide não atacar, mas no alto da torre um vigia acaba avistando você e \ndispara as sirenes. Logo os inimigos estão a sua volta, você sabe que não \ntem chances e não faz absolutamente nada. O comandante vermelho tira sua \nvida com o machado de guerra.");
																					teclado.nextLine();
																					System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																					teclado.nextLine();
																				}
																			}
																		}else{
																			System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																			vidap = 100;
																			vidam = 100;
																		}
																	}else{
																		teclado.nextLine();
																		System.out.println("Você tenta fugir, mas o som de seus passos chama a atenção de todos e acaba sendo pego e morto.");
																		teclado.nextLine();
																		System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																	}
																}else{
																	System.out.println("Não é necessário muito tempo para que a chuva inicie uma combustão em \nseus corpos queimando completamente a carne de vocês. Suas cinzas são \nagora parte de Misthalin.");
																	teclado.nextLine();
																	System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																	teclado.nextLine();
																}															
															}															
														}else{
															teclado.nextLine();
															System.out.println("Você: — A resposta é não, eu já tenho mais com o que me preocupar.");
															teclado.nextLine();
															System.out.println("Senhor: — Desarmado desse jeito você não vai muito longe, eu por outro lado \nestava disposto a te emprestar uma de minhas espadas. Agora saia daqui \nseu egoísta.");
															teclado.nextLine();
															System.out.println("Você encontra um inimigo no caminho, como você está desarmado o seu dano \né apenas 5. Ataque. ");
															teclado.nextLine();
															do {
																pontof= escolhe.nextInt(4)+1;
																System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
																ataque = teclado.nextInt();
																if (ataque == pontof) {
																	vidam = vidam-5;
																	System.out.println("Você acertou o ataque e deu 5 de dano!\nHP do inimigo: " +vidam+ "/100\n");
																}else {
																	vidap = vidap-25;
																	System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
																}
															} while (vidap > 0 && vidam > 0);
															if(vidap > 0){
																System.out.println("Você derrotou o inimigo, mas não recuperou sua vida!");
																teclado.nextLine();
																vidam = 100;
																System.out.println("Quando derrotado o inimigo emite um som estridente, o que acaba chamando \na atenção dos outros que estavam por perto. Você percebe que não tem \nchance alguma contra todos e apenas aceita a morte.");
																teclado.nextLine();
																System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																teclado.nextLine();
																
															}else{
																teclado.nextLine();
																System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
																teclado.nextLine();
																vidap = 100;
																vidam = 100;
															}
														}
													}else{
														System.out.println("Você é surpreendido por um inimigo, por estar desarmado você não tem a chance de se defender e é atingido no coração");
														teclado.nextLine();
														System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
														teclado.nextLine();
													}
												}else{
													teclado.nextLine();
													System.out.println("Você encontra um inimigo no caminho, como você está desarmado o seu dano \né apenas 5. Ataque. ");
													teclado.nextLine();
													do {
														pontof= escolhe.nextInt(4)+1;
														System.out.println("Escolha onde deseja atacar:\n1. Cabeça   2. Tronco\n3. Braços   4. Pernas");
														ataque = teclado.nextInt();
														if (ataque == pontof) {
															vidam = vidam-5;
															System.out.println("Você acertou o ataque e deu 5 de dano!\nHP do inimigo: " +vidam+ "/100\n");
														}else {
															vidap = vidap-25;
															System.out.println("Você errou o ataque e perdeu 25HP\nHP: " +vidap+ "/100\n");
														}
													} while (vidap > 0 && vidam > 0);
													if(vidap > 0){
														System.out.println("Você derrotou o inimigo, mas não recuperou sua vida!");
														teclado.nextLine();
														vidam = 100;
														System.out.println("Quando derrotado o inimigo emite um som estridente, o que acaba chamando \na atenção dos outros que estavam por perto. Você percebe que não tem \nchance alguma contra todos e apenas aceita a morte.");
														
													}else{
														System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
														vidap = 100;
														vidam = 100;
													}
												}
											}else{
												System.out.println("Isabella está fraca para correr, você volta para ajudar, mas uma flecha acaba \nacertado sua cabeça. Os inimigos tem apenas um arqueiro, o tempo para \ncolocar outra flecha no arco é de 2 segundos,  o que se mostra necessário \npara que Catarina e Henrique consigam fugir mata a dentro.");
												teclado.nextLine();
												System.out.println("|====================|\n|    Você morreu!    |\n|    FIM DE JOGO     |\n|====================|\n");
												teclado.nextLine();
											}
										}
									}
								}else{	
									teclado.nextLine();
									System.out.println("Tomado pela raiva e pelo ódio, você decide seguir sua jornada sozinho sem \ncomunicar sua família, que não estava sabendo de nada.");
									teclado.nextLine();
									elfo();
								}
							}if (menu == 2) {
								System.out.println("|==== OPÇÕES ====|\n| 1. Idioma      |\n| 2. Voltar      |\n|================|");
								options = teclado.nextInt();
							if (options == 1) {
									System.out.println("|======= IDIOMA =======|\n| 1. EN-US             |\n| 2. PT-BR             |\n|                      |\n| 3. Voltar            |\n|======================|");
									options = teclado.nextInt();
									if (options == 1) {
										System.out.println("Modified to English\n");
										menu = 3;
									}
								}
							}
						} while (menu != 3);
						if (options == 1) {
							menu = 0;
						}
					}
				}
			}
//### FECHAR #################
		} while (menu != 3);
	}
}
