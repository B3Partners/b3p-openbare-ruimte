--drop table maatregel_custom_input;

create table maatregel_custom_input (
        id  bigserial not null,
        index int4,
        value varchar(255),
        maatregel varchar(255),
        primary key (id)
);
    
create table mrl_eigenschap_custom_in (
        id  bigserial not null,
        index int4,
        value varchar(255),
        maatregel_eigenschap int8,
        primary key (id)
);
    
alter table maatregel_custom_input 
        add constraint FK8AD3200747824F58 
        foreign key (maatregel) 
        references maatregel;
        
alter table mrl_eigenschap_custom_in 
	add constraint FKD8369635F3317B25 
	foreign key (maatregel_eigenschap) 
        references maatregel_eigenschap;