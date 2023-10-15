package org.kplots.api

interface Test {


    /***
     * Returns the Plot ID from the Plot Name.
     * @param plotName Plot Name
     * @return Plot ID
     */
    fun getId(plotName: String): Long

    /**
     * Returns the Plot Name from the Plot ID.
     *
     * @param id Plot ID
     * @return Plot Name
     */
    fun getName(id: Long): String
}