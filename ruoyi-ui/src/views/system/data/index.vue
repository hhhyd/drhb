<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="地区编码" prop="regionCode">
        <el-input
          v-model="queryParams.regionCode"
          placeholder="请输入地区编码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="地区名称" prop="regionName">
        <el-input
          v-model="queryParams.regionName"
          placeholder="请输入地区名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="统计周期" prop="statPeriod">
        <el-input
          v-model="queryParams.statPeriod"
          placeholder="请输入统计周期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="统计日期" prop="statDate">
        <el-date-picker clearable
                        v-model="queryParams.statDate"
                        type="date"
                        value-format="yyyy-MM-dd"
                        placeholder="请选择统计日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="SO2超标累计数量" prop="so2ExceedCount">
        <el-input
          v-model="queryParams.so2ExceedCount"
          placeholder="请输入SO2超标累计数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="CO超标累计数量" prop="coExceedCount">
        <el-input
          v-model="queryParams.coExceedCount"
          placeholder="请输入CO超标累计数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="PM2.5超标累计数量" prop="pm25ExceedCount">
        <el-input
          v-model="queryParams.pm25ExceedCount"
          placeholder="请输入PM2.5超标累计数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="AQI等级超标累计数量" prop="aqiExceedCount">
        <el-input
          v-model="queryParams.aqiExceedCount"
          placeholder="请输入AQI等级超标累计数量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="AQI指数级别" prop="aqiLevel">
        <el-input
          v-model="queryParams.aqiLevel"
          placeholder="请输入AQI指数级别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="AQI检测累计总数" prop="totalDetectionCount">
        <el-input
          v-model="queryParams.totalDetectionCount"
          placeholder="请输入AQI检测累计总数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="AQI检测良好数" prop="goodDetectionCount">
        <el-input
          v-model="queryParams.goodDetectionCount"
          placeholder="请输入AQI检测良好数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="AQI检测超标数" prop="exceedDetectionCount">
        <el-input
          v-model="queryParams.exceedDetectionCount"
          placeholder="请输入AQI检测超标数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="覆盖率百分比" prop="coverageRate">
        <el-input
          v-model="queryParams.coverageRate"
          placeholder="请输入覆盖率百分比"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据值" prop="dataValue">
        <el-input
          v-model="queryParams.dataValue"
          placeholder="请输入数据值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:data:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:data:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:data:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:data:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="dataList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="主键ID" align="center" prop="id" />
      <el-table-column label="统计类型" align="center" prop="statType" />
      <el-table-column label="地区编码" align="center" prop="regionCode" />
      <el-table-column label="地区名称" align="center" prop="regionName" />
      <el-table-column label="统计周期" align="center" prop="statPeriod" />
      <el-table-column label="统计日期" align="center" prop="statDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.statDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="SO2超标累计数量" align="center" prop="so2ExceedCount" />
      <el-table-column label="CO超标累计数量" align="center" prop="coExceedCount" />
      <el-table-column label="PM2.5超标累计数量" align="center" prop="pm25ExceedCount" />
      <el-table-column label="AQI等级超标累计数量" align="center" prop="aqiExceedCount" />
      <el-table-column label="AQI指数级别" align="center" prop="aqiLevel" />
      <el-table-column label="AQI检测累计总数" align="center" prop="totalDetectionCount" />
      <el-table-column label="AQI检测良好数" align="center" prop="goodDetectionCount" />
      <el-table-column label="AQI检测超标数" align="center" prop="exceedDetectionCount" />
      <el-table-column label="覆盖率百分比" align="center" prop="coverageRate" />
      <el-table-column label="数据值" align="center" prop="dataValue" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:data:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:data:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改决策者可视化数据对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="100px">
        <el-row>
          <el-col :span="24">
            <el-form-item label="地区编码" prop="regionCode">
              <el-input v-model="form.regionCode" placeholder="请输入地区编码" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="地区名称" prop="regionName">
              <el-input v-model="form.regionName" placeholder="请输入地区名称" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="统计周期" prop="statPeriod">
              <el-input v-model="form.statPeriod" placeholder="请输入统计周期" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="统计日期" prop="statDate">
              <el-date-picker clearable
                              v-model="form.statDate"
                              type="date"
                              value-format="yyyy-MM-dd"
                              placeholder="请选择统计日期">
              </el-date-picker>
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="SO2超标累计数量" prop="so2ExceedCount">
              <el-input v-model="form.so2ExceedCount" placeholder="请输入SO2超标累计数量" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="CO超标累计数量" prop="coExceedCount">
              <el-input v-model="form.coExceedCount" placeholder="请输入CO超标累计数量" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="PM2.5超标累计数量" prop="pm25ExceedCount">
              <el-input v-model="form.pm25ExceedCount" placeholder="请输入PM2.5超标累计数量" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="AQI等级超标累计数量" prop="aqiExceedCount">
              <el-input v-model="form.aqiExceedCount" placeholder="请输入AQI等级超标累计数量" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="AQI指数级别" prop="aqiLevel">
              <el-input v-model="form.aqiLevel" placeholder="请输入AQI指数级别" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="AQI检测累计总数" prop="totalDetectionCount">
              <el-input v-model="form.totalDetectionCount" placeholder="请输入AQI检测累计总数" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="AQI检测良好数" prop="goodDetectionCount">
              <el-input v-model="form.goodDetectionCount" placeholder="请输入AQI检测良好数" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="AQI检测超标数" prop="exceedDetectionCount">
              <el-input v-model="form.exceedDetectionCount" placeholder="请输入AQI检测超标数" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="覆盖率百分比" prop="coverageRate">
              <el-input v-model="form.coverageRate" placeholder="请输入覆盖率百分比" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="数据值" prop="dataValue">
              <el-input v-model="form.dataValue" placeholder="请输入数据值" />
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listData, getData, delData, addData, updateData } from "@/api/system/data"

export default {
  name: "Data",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 决策者可视化数据表格数据
      dataList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        statType: null,
        regionCode: null,
        regionName: null,
        statPeriod: null,
        statDate: null,
        so2ExceedCount: null,
        coExceedCount: null,
        pm25ExceedCount: null,
        aqiExceedCount: null,
        aqiLevel: null,
        totalDetectionCount: null,
        goodDetectionCount: null,
        exceedDetectionCount: null,
        coverageRate: null,
        dataValue: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        statType: [
          { required: true, message: "统计类型不能为空", trigger: "change" }
        ],
        statPeriod: [
          { required: true, message: "统计周期不能为空", trigger: "blur" }
        ],
        statDate: [
          { required: true, message: "统计日期不能为空", trigger: "blur" }
        ],
      }
    }
  },
  created() {
    this.getList()
  },
  methods: {
    /** 查询决策者可视化数据列表 */
    getList() {
      this.loading = true
      listData(this.queryParams).then(response => {
        this.dataList = response.rows
        this.total = response.total
        this.loading = false
      })
    },
    // 取消按钮
    cancel() {
      this.open = false
      this.reset()
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        statType: null,
        regionCode: null,
        regionName: null,
        statPeriod: null,
        statDate: null,
        so2ExceedCount: null,
        coExceedCount: null,
        pm25ExceedCount: null,
        aqiExceedCount: null,
        aqiLevel: null,
        totalDetectionCount: null,
        goodDetectionCount: null,
        exceedDetectionCount: null,
        coverageRate: null,
        dataValue: null,
        createTime: null,
        updateTime: null
      }
      this.resetForm("form")
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1
      this.getList()
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm")
      this.handleQuery()
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length !== 1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset()
      this.open = true
      this.title = "添加决策者可视化数据"
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset()
      const id = row.id || this.ids
      getData(id).then(response => {
        this.form = response.data
        this.open = true
        this.title = "修改决策者可视化数据"
      })
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateData(this.form).then(response => {
              this.$modal.msgSuccess("修改成功")
              this.open = false
              this.getList()
            })
          } else {
            addData(this.form).then(response => {
              this.$modal.msgSuccess("新增成功")
              this.open = false
              this.getList()
            })
          }
        }
      })
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids
      this.$modal.confirm('是否确认删除决策者可视化数据编号为"' + ids + '"的数据项？').then(function() {
        return delData(ids)
      }).then(() => {
        this.getList()
        this.$modal.msgSuccess("删除成功")
      }).catch(() => {})
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/data/export', {
        ...this.queryParams
      }, `data_${new Date().getTime()}.xlsx`)
    }
  }
}
</script>
