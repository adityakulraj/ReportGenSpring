# ReportGenSpring

A sample ASync Flow for APIs returning Proccess Id
Here we have 2 APIs generateReport and getReport.

When generateReport is called, it returns a reportId to the user, and parallely triggers the code for report processing.

The user can use this reportId, to track whether the report is done or not.
