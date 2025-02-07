

public class Task 
{

    /*
     *  Add, Update, and Delete tasks
        Mark a task as in progress or done
        List all tasks
        List all tasks that are done
        List all tasks that are not done
        List all tasks that are in progress
     */

    private int id;
    private String description;
    private String status;
     
     
    /*
     *  id: A unique identifier for the task
        description: A short description of the task
        status: The status of the task (todo, in-progress, done)
        createdAt: The date and time when the task was created
        updatedAt: The date and time when the task was last updated
     */

    Task(String description) 
    {
        this.description = description;
    }

    public String getStatus() 
    {
        
        return this.status;
    }

    public String updateStatus(String status) 
    {
        String[] type = {"todo", "in-progress", "done"};

        for (String string : type) 
        {
            if(!string.equals(status)) 
            {
                return null;
            }
        }
        return status;
    }

    public String updateDescrption(String description) 
    {
        this.description = description;
        return description;
    }
    public String getDescription() 
    {
        return this.description;
    }

    public int getId()
    {
        return this.id;
    }

    public String toJson()
    {
        
    }
}