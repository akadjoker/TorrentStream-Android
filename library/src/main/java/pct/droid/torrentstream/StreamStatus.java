/*
 * This file is part of TorrentStreamer-Android.
 *
 * TorrentStreamer-Android is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TorrentStreamer-Android is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TorrentStreamer-Android. If not, see <http://www.gnu.org/licenses/>.
 */

package pct.droid.torrentstream;

public class StreamStatus {
    public float progress;
    public int bufferProgress;
    public int seeds;
    public float downloadSpeed;

    StreamStatus(float progess, int bufferProgress, int seeds, int downloadSpeed) {
        this.progress = progess;
        this.bufferProgress = bufferProgress;
        this.seeds = seeds;
        this.downloadSpeed = downloadSpeed;
    }
}