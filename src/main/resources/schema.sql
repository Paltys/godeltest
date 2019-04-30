CREATE TABLE public.employee
(
    employee_id serial NOT NULL,
    first_name text NOT NULL,
    last_name text NOT NULL,
    department_id INTEGER,
    job_title text NOT NULL,
    gender text NOT NULL,
    date_of_birth date NOT NULL
);
CREATE UNIQUE INDEX employee_empoyee_id_uindex ON public.employee (employee_id);

