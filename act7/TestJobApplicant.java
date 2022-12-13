package act7;

public class TestJobApplicant {
    public static void main(String[] args) {
        /**var sc = new Scanner(System.in);
        String[] cat = {"Applicant Name: ", "Phone Number: ", "Can do Word Processing: ", "Can do Spreadsheeets", "Can do Database: ", "Can do Graphics: "};
        String[] response = new String[6];
        System.out.println("Complete the fields below type [yes] if you can perform the specific skills or [no] if you cannot.");
        for(int i = 0; i < 6; i++){
            System.out.print(cat[i]);
            response[i] = sc.nextLine();
        }
        sc.close();*/
        JobApplicant[] applicants = {
            new JobApplicant("Gernel", "9501744009", true, true, true, true),
            new JobApplicant("Jayjay", "9511265847", false, false, true, true),
            new JobApplicant("Tatsumi", "9556265847", false, true, true, true)
        };

        ShowResult(applicants);
    }

    static void ShowResult(JobApplicant[] applicants){
        for (JobApplicant jobApplicant : applicants) {
            var sb = new StringBuilder();
            sb.append(String.format("\nApplicant Name  : %s\n", jobApplicant.getName()));
            sb.append(String.format("Phone Number    : %s\n", jobApplicant.getPhone()));
            sb.append(String.format("Skills:\n"));
            sb.append(String.format("Word Processing : %s\n", jobApplicant.getWproc() == true ? "Yes" : "No"));
            sb.append(String.format("Spreadsheets    : %s\n", jobApplicant.getSsheets() == true ? "Yes" : "No"));
            sb.append(String.format("Database        : %s\n", jobApplicant.getDbase() == true ? "Yes" : "No"));
            sb.append(String.format("Graphics        : %s\n", jobApplicant.getGraphics() == true ? "Yes" : "No"));
            
            byte i = 0;
            if(jobApplicant.getWproc() == true) i++;
            if(jobApplicant.getSsheets() == true) i++;
            if(jobApplicant.getDbase() == true) i++;
            if(jobApplicant.getGraphics() == true) i++;
            sb.append(String.format("Remarks         : %s\n", i >= 3 ? "Qualified" : "Not-Qualified"));
            System.out.println(sb.toString());
        }
    }
}
