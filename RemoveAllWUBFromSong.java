//Q: A song with words "I AM X" can transform into a dubstep remix as "WUBWUBIWUBAMWUBWUBX" and cannot transform into "WUBWUBIAMWUBX". Return the words of the initial song!
public class RemoveAllWUBFromSong {
  public static String SongDecoder (String song)
  {
     return song.replaceAll("(WUB)+", " ").trim();
   }
}