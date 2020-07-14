import java.util.Set;
import java.util.HashMap;


public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Knights of Cydonia", "Come ride with me Through the veins of history I'll show you a God Falls asleep on the job And how can we win, When fools can be kings Don't waste your time Or time will waste you No one's going to take me alive Time has come to make things right You and I must fight for our rights You and I must fight to survive No one's going to take me alive Time has come to make things right You and I must fight for our rights You and I must fight to survive No one's going to take me alive Time has come to make things right You and I must fight for our rights You and I must fight to survive");
        trackList.put("Supermassive Black Hole", "Oh baby, don't you know I suffer? Oh baby, can you hear me moan? You caught me under false pretenses How long before you let me go? Ooh You set my soul alight You set my soul alight Glaciers melting in the dead of night And the superstars sucked into the super massive (you set my soul alight) Glaciers melting in the dead of night And the superstars sucked into the super massive (you set my soul) I thought I was a fool for no one Oh baby, I'm a fool for you You're the queen of the superficial And how long before you tell the truth? You set my soul alight You set my soul alight Glaciers melting in the dead of night And the superstars sucked into the super massive (you set my soul alight) Glaciers melting in the dead of night And the superstars sucked into the super massive (you set my soul) Super massive black hole Super massive black hole Super massive black hole (Super massive black hole) Glaciers melting in the dead of night And the superstars sucked into the super massive Glaciers melting in the dead of night And the superstars sucked into the super massive Glaciers melting in the dead of night And the superstars sucked into the super massive (you set my soul alight) Glaciers melting in the dead of night And the superstars sucked into the super massive (you set my soul) Super massive black hole Super massive black hole Super massive black hole (Super massive black hole)");
        trackList.put("Resistance", "Is our secret safe tonight? And are we out of sight? Or will our world come tumbling down? Will they find our hiding place? Is this our last embrace? Or will the walls start caving in? But it should've been right (It could be wrong, could be wrong) Let our hearts ignite (It could be wrong, could be wrong) Are we digging a hole? (It could be wrong, could be wrong) This is outta control It could never last (It could be wrong, could be wrong) Must erase it fast (It could be wrong, could be wrong) But it could've been right (It could be wrong, could be) Love is our resistance They keep us apart and they won't stop breaking us down And hold me, our lips must always be sealed If we live our life in fear I'll wait a thousand years Just to see you smile again Quell your…");
        trackList.put("Madness", "I, I can't get these memories out of my mind And some kind of madness has started to evolve I, I tried so hard to let you go But some kind of madness is swallowing me whole, yeah I have finally seen the light And I have finally realized What you mean Oh oh oh And now, I need to know is this real love Or is it just madness keeping us afloat? And when I look back at all the crazy fights we had Like some kind of madness Was taking control Yeah And now I have finally seen the light And I have finally realized What you need Mm And now I have finally seen the end (Finally seen the end) And I'm not expecting you to care (Expecting you to care) But I have finally seen the light (Finally seen the light) I have finally realized (Realized) I need to love I need to love Come to me, Trust in your dream some on and rescue me Yes I have known, I can be wrong Maybe I'm too headstrong Our love is Madness");

        String name = trackList.get("Knights of Cydonia");
        System.out.println("The lyrics to Knights of Cydonia are: " + name);
        
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));

        }
    }
}