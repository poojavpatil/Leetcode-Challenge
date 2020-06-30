//Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character. Note that after backspacing an empty text, the text will continue empty.
class BackspaceStringCompare
{
  public boolean backspaceCompare(String S, String T)
  {
    return build(S).equals(build(T));
  }
  public String build(String S)
  {
    Stack<Character> st = new Stack<>();
    for(char c: S.toCharArray())
    {
      if(c!='#')
        st.push(c);
      else if(!st.empty())
        st.pop();
    }
    return String.valueOf(st);
  }
}
