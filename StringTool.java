class StringTool
{
    class Analyzer
    {
        String text;

        Analyzer(String t)
        {
            text = t;
        }

        int countVowels()
        {
            int v = 0;
            for(int i = 0; i < text.length(); i++)
            {
                char c = text.charAt(i);
                if("aeiouAEIOU".indexOf(c) != -1)
                 v++;
            }
            return v;
        }

        int countWords()
        {
            return text.split(" ").length;
        }

        String reverse()
        {
            String r = "";
            for(int i = text.length() - 1; i >= 0; i--)
            r += text.charAt(i);
            return r;
        }
    }

    public static void main(String[] args)
    {
        String sentence = "Java programming is fun";

        StringTool st = new StringTool();
        StringTool.Analyzer a = st.new Analyzer(sentence);

        System.out.println("Vowel Count: " + a.countVowels());
        System.out.println("Word Count: " + a.countWords());
        System.out.println("Reversed String: " + a.reverse());
    }
}