package modal.Lesson2_Task3;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<News> news = new ArrayList<>();

    private static Long id = 5L;

    static {
        news.add(new News(1L, "Talking 'Top Gun: Maverick' With Director Joseph Kosinski",
                "On this week’s show, director Joseph Kosinski (friend and fan of the show!) " +
                        "joins us to discuss his new film Top Gun: Maverick, starring Tom Cruise, Jennifer Connelly, and Miles Teller.",
                "Gabriel Kovacs", "Cinema"));
        news.add(new News(2L, "Knives Out 2: What We Know So Far About Glass Onion: A Knives Out Mystery",
                "A tagline in the trailer for Knives Out promised that Rian Johnson’s suspenseful thriller starring Daniel Craig" +
                        " would be “a whodunit like no one has done it before,” and the twisted, wonderfully acted, and thoroughly hilarious" +
                        " film turned out to be just that, earning an Oscar nomination and $300 million worldwide. So, naturally, a Knives Out 2 is on the horizon.",
                "Jason Wiese", "Cinema"));

        news.add(new News(3L, "Sony Music, Live Nation, Netflix, More Offer Staff Travel Reimbursement for Abortions",
                "From media organizations to sporting goods, companies are reassuring staff about reproductive rights care " +
                        "following the Supreme Court’s decision to overturn Roe v. Wade",
                "ALTHEA LEGASPI & ETHAN MILLMAN", "Culture"));
        news.add(new News(4L, "Wimbledon: Serena Williams, Rafael Nadal, Novak Djokovic & Andy Murray lead stellar cast",
                "A stellar cast of ageing greats has assembled for what could be one of the final times at Wimbledon as the " +
                        "jewel of the British sporting summer returns.",
                "Jonathan Jurejko", "Sport"));
    }

public static ArrayList<News> getAllNews () {
        return news;
}


}
