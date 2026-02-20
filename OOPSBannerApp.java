/*
OOPSBAnner App UC7 - OOPS Banner Display

this clas demonstrates a simple java application that displays the object
oriented programming system OOPS acronym to the console

@author Rithvik
@version 7.0

*/


public class OOPSBannerApp 
{
    static class CharacterPatternMap
    {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern)
        {
            this.character = character;
            this.pattern = pattern;  
        }

        public Character getCharacter()
        {
          return character;    
        }
        public String[] getPattern()
        {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
		String[] oP = new String[] 
        {
            "    *******    ",
            "  **       **  ",
            " **         ** ",
            " **         ** ",
            " **         ** ",
            "  **       **  ",
            "    *******    "
        };

		String[] pP = new String[] 
        {
            "**************",
            "**          **",
            "**          **",
            "**************",
            "**            ",
            "**            ",
            "**            "
        };

		String[] sP = new String[] 
        {
                
            "**************",
            "**            ",
            "**            ",
            "**************",
            "            **",
            "            **",
            "**************"
        };


		CharacterPatternMap oPattern = new CharacterPatternMap('O', oP);
		CharacterPatternMap pPattern = new CharacterPatternMap('P', pP);
		CharacterPatternMap sPattern = new CharacterPatternMap('S', sP);

		CharacterPatternMap[] map = new CharacterPatternMap[3];
		map[0] = oPattern;
		map[1] = pPattern;
		map[2] = sPattern;
		return map;
	}

    public static String[] getCharacterPattern(Character ch, CharacterPatternMap[] charMaps)
    {
        for (int i=0; i < charMaps.length; i++) 
        {
			if(ch.equals(charMaps[i].character)) 
            {
				return charMaps[i].pattern;
			}
		}
		return charMaps[0].pattern;
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps)
    {
        for (int i=0; i < message.length(); i++) 
        {
			Character c = message.charAt(i);
			String[] lines = getCharacterPattern(c, charMaps);
			for (String line : lines) {
				System.out.println(line);
			}
		}

    }
    public static void main(String[] args) 
    {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
        
    }
}

           