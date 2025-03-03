// Problem Link - https://www.geeksforgeeks.org/problems/corner-digits1317/0

class Solution
{
    public int corner_digitSum(int n)
    {
        // code here
        int Lastdigit = n%10;
        int Firstdigit =n/10;
        while(Firstdigit >= 10)
        {
            //Firstdigit = Firstdigit%10;
            Firstdigit=Firstdigit/10;
        }
        return Firstdigit + Lastdigit;
    }
}
