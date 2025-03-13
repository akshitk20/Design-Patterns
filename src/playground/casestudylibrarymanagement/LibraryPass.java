package playground.casestudylibrarymanagement;

import java.time.LocalDate;
import java.util.List;

public class LibraryPass {
    List<String> bookNames;
    String userName;
    LocalDate issuedDate;

    LocalDate dueDate;

    public LibraryPass(List<String> bookNames, String userName, LocalDate issuedDate) {
        this.bookNames = bookNames;
        this.userName = userName;
        this.issuedDate = issuedDate;
    }
}
