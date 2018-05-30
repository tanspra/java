class Profile
{
    static String userName="admin";
    static String password="admin";
    static boolean isTrue(String uName,String pass)
    {
        if(uName.equals(userName) && pass.equals(password))
        {
            return true;
        }else{
            return false;
        }
    }
    
}