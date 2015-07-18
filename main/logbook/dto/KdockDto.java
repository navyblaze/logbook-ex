/**
 * 
 */
package logbook.dto;

import java.util.Date;

/**
 * 建造ドック
 * @author Nekopanda
 */
public class KdockDto {

    public static final KdockDto EMPTY = new KdockDto(false, 0, null);

    /** 今使用中？ */
    private final boolean nowUsing;

    /** ship id */
    private final int shipId;

    /** 完成する時間 */
    private final Date kdocktime;

    /**
     * コンストラクター
     */
    public KdockDto(boolean nowUsing, int shipId, Date kdocktime) {
        this.nowUsing = nowUsing;
        this.shipId = shipId;
        this.kdocktime = kdocktime;
    }

    /**
     * 今使用中？
     * @return 今使用中？
     */
    public boolean getNowUsing() {
        return this.nowUsing;
    }

    public int getShipId() {
        return this.shipId;
    }

    /**
     * 完成する時間
     * @return 完成する時間
     */
    public Date getKdocktime() {
        return this.kdocktime;
    }
}
