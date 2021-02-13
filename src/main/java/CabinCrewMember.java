public class CabinCrewMember{
        private String name;
        private CrewRank crewRank;

        public CabinCrewMember(String name, CrewRank crewRank) {
            this.name = name;
            this.crewRank = crewRank;
        }

        public String getName() {
            return this.name;
        }

        public CrewRank getCrewRank() {
            return this.crewRank;
        }
    }
