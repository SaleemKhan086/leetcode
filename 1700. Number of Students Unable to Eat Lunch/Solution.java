class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i = 0;
        while(i<sandwiches.length){
            int count = 0;
            for(int j=0;j<students.length&&i<sandwiches.length;j++){
                if(students[j]==sandwiches[i]){
                    students[j]=-1;
                    count++;
                    i++;
                }
            }
            if(count==0){
                break;
            }
        }

        return sandwiches.length-i;
    }
}
