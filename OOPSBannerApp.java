/*
OOPSBAnner App UC8 - OOPS Banner Display

this clas demonstrates a simple java application that displays the object
oriented programming system OOPS acronym to the console using Hash Maps

@author Rithvik
@version 8.0
*/


import java.util.HashMap;

public class OOPSBannerApp {

	public static HashMap<Character, String[]> createCharacterMap() {
		HashMap<Character, String[]> charMap = new HashMap<>();

		charMap.put('O', new String[] 
        {
            "    *******    ",
            "  **       **  ",
            " **         ** ",
            " **         ** ",
            " **         ** ",
            "  **       **  ",
            "    *******    "
        });

		charMap.put('P', new String[] 
        {
            "**************",
            "**          **",
            "**          **",
            "**************",
            "**            ",
            "**            ",
            "**            "
        });

		charMap.put('S', new String[] 
        {
                
            "**************",
            "**            ",
            "**            ",
            "**************",
            "            **",
            "            **",
            "**************"
        });

		return charMap;
	}

	
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) 
    {
        if (message == null || message.isEmpty()) return;
        String[] firstPat = charMap.get(message.charAt(0));
        int height = firstPat.length;
        for (int row = 0; row < height; row++) 
        {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < message.length(); i++) 
            {
                String[] pat = charMap.get(message.charAt(i));
                line.append(pat[row]);
                if (i < message.length() - 1) line.append("  "); 
            }
            System.out.println(line.toString());
        }
    }


	public static void main(String[] args) {
		HashMap<Character, String[]> charMap = createCharacterMap();
		String message = "OOPS";
		displayBanner(message, charMap);
	}
}
