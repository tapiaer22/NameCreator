import java.util.Random;
import java.util.ArrayList;
import java.util.List;

//This class has methods that create random names
public class NameCreator 
{
	private char[] vowels={'a', 'e', 'i', 'o', 'u'};
	private char[] consonants={'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 
			'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

	//Default length: 5
	public String randomName()
	{
		return randomName(5);
	}
	//Create a name with parameterized length of letters
	public String randomName(int len)
	{
		Random r = new Random();
		int vow = 0, cons = 0, letters = 0;	//Variables for current vowels, consonants, and letters
		String name = "";	//Variable for generated name
		while (letters<len)
		{
			int valueR = r.nextInt(2);	//Get a random integer 1 or 2
			//Get first word uppercase
			if (letters == 0)
			{
				if (valueR == 0)
				{
					name += Character.toUpperCase(vowels[r.nextInt(5)]);
					vow +=2;
					letters++;
				}
				else
				{
					name += Character.toUpperCase(consonants[r.nextInt(21)]);
					cons +=2;
					letters++;
				}
			}
			//When there are two vowels already
			if (vow >= 2)
			{
				name += consonants[r.nextInt(21)];
				vow = 1;
				cons++;
				letters++;
			}
			//When there are 2 consonants already
			else if (cons >= 2)
			{
				name += vowels[r.nextInt(5)];
				cons = 1;
				vow++;
				letters++;
			}


			//If Random integer == 0, add a vowel
			else if (valueR == 0)
			{
				name += vowels[r.nextInt(5)];
				vow++;
				letters++;
			}
			//If Random integer == 1, add a consonant
			else
			{
				name += consonants[r.nextInt(21)];
				cons++;
				letters++;
			}
		}
		return name;
	}
	
	//Create a List of  5 names of length 5
	public List<String> randomNameList(){
		return randomNameList(5);
	}
	//Create a List of specified amount of names with 5 char names
	public List<String> randomNameList(int count)
	{
		return randomNameList(count,5);
	}
	//Create List of random names
	//Parameter for amount of names: count
	//Parameter for length of names: name_len
	public List<String> randomNameList(int count, int name_len){
		List<String> names = new ArrayList<>();
		for (int i = 0; i < count; i++){
			names.add(randomName(name_len));
		}
		return names;
	}
}
