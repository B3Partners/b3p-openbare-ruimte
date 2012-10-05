create table maatregel_custom_input (
	id  bigserial not null,
	index int4,
	value varchar(255),
	maatregel_eigenschap int8,
	primary key (id)
);

alter table maatregel_custom_input 
	add constraint FK8AD32007F3317B25 
	foreign key (maatregel_eigenschap) 
	references maatregel_eigenschap;