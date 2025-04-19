package com.example.mapstruct.PojoMapping.PlainAndSimple;

// basic mapping without mapper library support
public class Mapper {

    public Destination sourceToDestination(Source source) {
        if ( source == null ) {
            return null;
        }
        Destination destination = new Destination();
        destination.setName( source.getName() );
        destination.setDescription( source.getDescription() );
        return destination;
    }

    public Source destinationToSource(Destination destination){
        if ( destination == null ) {
            return null;
        }
        Source source = new Source();
        source.setName( destination.getName() );
        source.setDescription( destination.getDescription() );
        return source;
    }
}
