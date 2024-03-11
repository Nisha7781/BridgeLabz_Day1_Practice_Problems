class CommandLineName 
{
    public static void main(String[] args) 
    {
        if (args.length > 0) 
        {
            System.out.println("Name: " + args[0]);
        } 
        else 
        {
            System.out.println("Please provide a name as a command-line argument.");
        }
    }
}
