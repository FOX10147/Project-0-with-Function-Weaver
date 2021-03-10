create table Integrals
(   id int,
    Integral VARCHAR,
    Solution VARCHAR
);

insert into Integrals values ('1','A*dx','A*x+C');
insert into Integrals values ('2','x^(n)','(x^(n+1))/(n+1)+C');
insert into Integrals values ('3','dx/x','log(x)+C');
insert into Integrals values ('4','e^(x)*dx','e^(x)+C');
insert into Integrals values ('5','A^(x)*dx','(A^(x))/log(A)+C');
insert into Integrals values ('6','sin(x)*dx','-cos(x)+C');
insert into Integrals values ('7','cos(x)*dx','sin(x)+C');
insert into Integrals values ('8','(sec(x))^(2)*dx','tan(x)+C');
insert into Integrals values ('9','(csc(x))^(2)*dx','-cot(x)+C');
insert into Integrals values ('10','sec(x)*tan(x)*dx','sec(x)+C');
insert into Integrals values ('11','csc(x)*cot(x)*dx','-csc(x)+C');
insert into Integrals values ('12','tan(x)*dx','log(sec(x))+C');
insert into Integrals values ('13','cot(x)*dx','log(sin(x))+C');
insert into Integrals values ('14','sec(x)*dx','log(sec(x)+tan(x))+C');
insert into Integrals values ('15','csc(x)*dx','log(csc(x)-cot(x))+C');
insert into Integrals values ('16','dx/(sqrt(A^(2)-x^(2)))','asin(x/A)+C');
insert into Integrals values ('17','dx/(A^(2)+x^(2))','(atan(x/A))/A+C');
insert into Integrals values ('18','dx/(x*sqrt(x^(2)-A^(2)))','(asec(x/A))/A+C');
insert into Integrals values ('19','dx/(A^(2)-x^(2))','log((x+A)/(x-A))/(2*A)+C');
insert into Integrals values ('20','dx/(x^(2)-A^(2))','log((x-A)/(x+A))/(2*A)+C');