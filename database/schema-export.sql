
    create table maatregel (
        id varchar(255) not null,
        omschrijving varchar(255),
        primary key (id)
    );

    create table maatregel_eigenschap (
        id int8 not null,
        deficode varchar(255),
        hoeveelheid int4,
        maatregel int8,
        primary key (id)
    );

    create table maatregel_gepland (
        id int8 not null,
        maatregel varchar(255),
        primary key (id)
    );

    create table raw_crow (
        id int8 not null,
        aanwijzing varchar(255),
        deficode varchar(255),
        eenheid varchar(255),
        regelnr int4,
        release varchar(255),
        swc int4,
        tekst varchar(255),
        type varchar(255),
        volgnr int4,
        vrij varchar(255),
        wc int4,
        primary key (id)
    );

    alter table maatregel_eigenschap 
        add constraint FK93ABE6E61A053ED 
        foreign key (maatregel) 
        references maatregel_gepland;

    alter table maatregel_gepland 
        add constraint FKD26E8AD247824F58 
        foreign key (maatregel) 
        references maatregel;
