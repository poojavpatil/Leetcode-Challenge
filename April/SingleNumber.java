//Given a non-empty array of integers, every element appears twice except for one. Find that single one.

class SingleNumber
{
	public int[] singleNumber(int[] nums)
	{
		HashSet<Integer> has = new HashSet<>();
		for(int n: nums)
		{
			if(!has.add(n))
			{
				has.remove(n);
			}
		}
		Iterator<Integer> it = has.iterator();
		return it.next;
	}
}
