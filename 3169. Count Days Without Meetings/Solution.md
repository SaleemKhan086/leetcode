We basically need to find the gaps between the meetings and count the days when no meeting is there.

So we sort the meetings by their starting day. And traverse through all the meetings. Till meeting start time is less than the maxEnd time seen so far, that means there is overlap, so we continue. If start time is greater than the maxEnd time seen so far, that means there is a gap. So we add the gap between start time and the maxEnd time to our answer (freeDays).


At last we add the remaining days to our ans (freeDays).

Time Complexity: $$O(Nlog(N))$$ -> N = length of meetings array

Space Complexity: $$O(1)$$
