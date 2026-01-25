package org.apache.spark.sql.lakesoul.catalog

import java.{util => ju}

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.connector.catalog.Table
import org.apache.spark.sql.connector.catalog.SupportsPartitionManagement
import org.apache.spark.sql.connector.catalog.SupportsRead
import org.apache.spark.sql.connector.catalog.SupportsWrite
import org.apache.spark.sql.catalyst.InternalRow
import org.apache.spark.sql.connector.read.ScanBuilder
import org.apache.spark.sql.util.CaseInsensitiveStringMap
import org.apache.spark.sql.connector.catalog.TableCapability
import org.apache.spark.sql.catalyst.InternalRow
import org.apache.spark.sql.connector.write.{LogicalWriteInfo, WriteBuilder}
import org.apache.spark.sql.types.StructType

case class LakeSoulTableV2(spark: SparkSession)
    extends Table
    with SupportsWrite
    with SupportsRead
    with SupportsPartitionManagement {

  override def name(): String = ???

  override def schema(): StructType = ???

  override def capabilities(): ju.Set[TableCapability] = ???

  override def newWriteBuilder(info: LogicalWriteInfo): WriteBuilder = ???

  override def newScanBuilder(options: CaseInsensitiveStringMap): ScanBuilder =
    ???

  override def partitionSchema(): StructType = ???

  override def createPartition(
      ident: InternalRow,
      properties: ju.Map[String, String]
  ): Unit = ???

  override def dropPartition(ident: InternalRow): Boolean = ???

  override def replacePartitionMetadata(
      ident: InternalRow,
      properties: ju.Map[String, String]
  ): Unit = ???

  override def loadPartitionMetadata(
      ident: InternalRow
  ): ju.Map[String, String] = ???

  override def listPartitionIdentifiers(
      names: Array[String],
      ident: InternalRow
  ): Array[InternalRow] = ???
}
