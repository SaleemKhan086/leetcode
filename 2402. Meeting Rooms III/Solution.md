First we sort all the meetings by their start time. Then we loop through each meeting and go through all the rooms.

For each room we loop through the rooms and assign the first one available at that time. 

If no room is available at the meeting start time, then we take the room with earliest finish time ie. min of `rooms[i]`.

Keep the counter for all the rooms.

Return the room index with maximum counter.

Time Complexity : $O(n*m)$ // n=no. of rooms, m=no. of meetings
Spece Complexity: $O(n)$
