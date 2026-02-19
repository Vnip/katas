class Badge {
    public String print(Integer id, String name, String department) {
        String employeeBadge = null;

        if(id != null){
            if(department != null){
            employeeBadge = "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
            }else{
            employeeBadge = "[" + id + "]" + " - " + name + " - " + "OWNER";
            }
        }else{
             if(department != null){
                  employeeBadge = name + " - " + department.toUpperCase();
             }else{
                  employeeBadge = name + " - " + "OWNER";
             }
        }
        
        return employeeBadge;

        
    }
}
