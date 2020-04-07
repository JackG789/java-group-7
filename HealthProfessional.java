

public class HealthProfessional
{
    // instance variables
    private String name;
    private String workArea;
    private String profession;
    private int id;

    /**
     * Constructor for objects of class Student
     */
    public HealthProfessional(int newid, String newname, String newworkArea, String newprofession)
    {
        // initialise instance variables
    	id = newid;
    	name = newname;
    	workArea = newworkArea;
    	profession = newprofession;
    }


    public int getid() {
    	return id;
    }


    public String getName()
    {
        return name;
    }


    public String getworkArea()
    {
        return workArea;
    }

    public String getProfession()
    {
    	return profession;
    }



    public void setName(String newname)
    {
    	name = newname;
    }


    public void setWorkArea(String newworkArea)
    {
    	workArea = newworkArea;
    }

    public void setProfession(String newprofession)
    {
    	profession = newprofession;
    }

    public void setid(int newid) {
    	id = newid;
    }

    public String showInfo()
    {
        String formattedinfo;

        formattedinfo="Health Professional info: "+ "ID:"+ id + "| Name:" + name +  "| Working Area: " + workArea + "| Profession: " + profession;

        return formattedinfo;
    }






}
