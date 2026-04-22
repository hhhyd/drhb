<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="所属省区域编号" prop="provinceId">
        <el-input
          v-model="queryParams.provinceId"
          placeholder="请输入所属省区域编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属市区域编号" prop="cityId">
        <el-input
          v-model="queryParams.cityId"
          placeholder="请输入所属市区域编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="反馈信息所在区域详细地址" prop="address">
        <el-input
          v-model="queryParams.address"
          placeholder="请输入反馈信息所在区域详细地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="空气二氧化硫浓度值" prop="so2Value">
        <el-input
          v-model="queryParams.so2Value"
          placeholder="请输入空气二氧化硫浓度值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="空气二氧化硫指数级别" prop="so2Level">
        <el-input
          v-model="queryParams.so2Level"
          placeholder="请输入空气二氧化硫指数级别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="空气一氧化碳浓度值" prop="coValue">
        <el-input
          v-model="queryParams.coValue"
          placeholder="请输入空气一氧化碳浓度值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="空气一氧化碳指数级别" prop="coLevel">
        <el-input
          v-model="queryParams.coLevel"
          placeholder="请输入空气一氧化碳指数级别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="空气悬浮颗粒物浓度值" prop="spmValue">
        <el-input
          v-model="queryParams.spmValue"
          placeholder="请输入空气悬浮颗粒物浓度值"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="空气PM2.5指数级别" prop="spmLevel">
        <el-input
          v-model="queryParams.spmLevel"
          placeholder="请输入空气PM2.5指数级别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="空气质量指数级别" prop="aqiId">
        <el-input
          v-model="queryParams.aqiId"
          placeholder="请输入空气质量指数级别"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="确认日期" prop="confirmDate">
        <el-input
          v-model="queryParams.confirmDate"
          placeholder="请输入确认日期"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="确认时间" prop="confirmTime">
        <el-input
          v-model="queryParams.confirmTime"
          placeholder="请输入确认时间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所属网格员编号" prop="gmId">
        <el-input
          v-model="queryParams.gmId"
          placeholder="请输入所属网格员编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="反馈者编号" prop="fdId">
        <el-input
          v-model="queryParams.fdId"
          placeholder="请输入反馈者编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="反馈信息描述" prop="information">
        <el-input
          v-model="queryParams.information"
          placeholder="请输入反馈信息描述"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="备注" prop="remarks">
        <el-input
          v-model="queryParams.remarks"
          placeholder="请输入备注"
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
          v-hasPermi="['system:statistics:add']"
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
          v-hasPermi="['system:statistics:edit']"
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
          v-hasPermi="['system:statistics:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:statistics:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="statisticsList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="统计信息编号" align="center" prop="id" />
      <el-table-column label="所属省区域编号" align="center" prop="provinceId" />
      <el-table-column label="所属市区域编号" align="center" prop="cityId" />
      <el-table-column label="反馈信息所在区域详细地址" align="center" prop="address" />
      <el-table-column label="空气二氧化硫浓度值" align="center" prop="so2Value" />
      <el-table-column label="空气二氧化硫指数级别" align="center" prop="so2Level" />
      <el-table-column label="空气一氧化碳浓度值" align="center" prop="coValue" />
      <el-table-column label="空气一氧化碳指数级别" align="center" prop="coLevel" />
      <el-table-column label="空气悬浮颗粒物浓度值" align="center" prop="spmValue" />
      <el-table-column label="空气PM2.5指数级别" align="center" prop="spmLevel" />
      <el-table-column label="空气质量指数级别" align="center" prop="aqiId" />
      <el-table-column label="确认日期" align="center" prop="confirmDate" />
      <el-table-column label="确认时间" align="center" prop="confirmTime" />
      <el-table-column label="所属网格员编号" align="center" prop="gmId" />
      <el-table-column label="反馈者编号" align="center" prop="fdId" />
      <el-table-column label="反馈信息描述" align="center" prop="information" />
      <el-table-column label="备注" align="center" prop="remarks" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:statistics:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:statistics:remove']"
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

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="100px">
        <el-row>
          <el-col :span="24">
            <el-form-item label="所属省区域编号" prop="provinceId">
              <el-input v-model="form.provinceId" placeholder="请输入所属省区域编号" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="所属市区域编号" prop="cityId">
              <el-input v-model="form.cityId" placeholder="请输入所属市区域编号" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="反馈信息所在区域详细地址" prop="address">
              <el-input v-model="form.address" placeholder="请输入反馈信息所在区域详细地址" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="空气二氧化硫浓度值" prop="so2Value">
              <el-input v-model="form.so2Value" placeholder="请输入空气二氧化硫浓度值" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="空气二氧化硫指数级别" prop="so2Level">
              <el-input v-model="form.so2Level" placeholder="请输入空气二氧化硫指数级别" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="空气一氧化碳浓度值" prop="coValue">
              <el-input v-model="form.coValue" placeholder="请输入空气一氧化碳浓度值" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="空气一氧化碳指数级别" prop="coLevel">
              <el-input v-model="form.coLevel" placeholder="请输入空气一氧化碳指数级别" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="空气悬浮颗粒物浓度值" prop="spmValue">
              <el-input v-model="form.spmValue" placeholder="请输入空气悬浮颗粒物浓度值" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="空气PM2.5指数级别" prop="spmLevel">
              <el-input v-model="form.spmLevel" placeholder="请输入空气PM2.5指数级别" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="空气质量指数级别" prop="aqiId">
              <el-input v-model="form.aqiId" placeholder="请输入空气质量指数级别" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="确认日期" prop="confirmDate">
              <el-input v-model="form.confirmDate" placeholder="请输入确认日期" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="确认时间" prop="confirmTime">
              <el-input v-model="form.confirmTime" placeholder="请输入确认时间" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="所属网格员编号" prop="gmId">
              <el-input v-model="form.gmId" placeholder="请输入所属网格员编号" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="反馈者编号" prop="fdId">
              <el-input v-model="form.fdId" placeholder="请输入反馈者编号" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="反馈信息描述" prop="information">
              <el-input v-model="form.information" placeholder="请输入反馈信息描述" />
            </el-form-item>
          </el-col>
          <el-col :span="24">
            <el-form-item label="备注" prop="remarks">
              <el-input v-model="form.remarks" placeholder="请输入备注" />
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
import { listStatistics, getStatistics, delStatistics, addStatistics, updateStatistics } from "@/api/system/statistics"

export default {
  name: "Statistics",
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
      // 【请填写功能名称】表格数据
      statisticsList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        provinceId: null,
        cityId: null,
        address: null,
        so2Value: null,
        so2Level: null,
        coValue: null,
        coLevel: null,
        spmValue: null,
        spmLevel: null,
        aqiId: null,
        confirmDate: null,
        confirmTime: null,
        gmId: null,
        fdId: null,
        information: null,
        remarks: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        provinceId: [
          { required: true, message: "所属省区域编号不能为空", trigger: "blur" }
        ],
        cityId: [
          { required: true, message: "所属市区域编号不能为空", trigger: "blur" }
        ],
        address: [
          { required: true, message: "反馈信息所在区域详细地址不能为空", trigger: "blur" }
        ],
        so2Value: [
          { required: true, message: "空气二氧化硫浓度值不能为空", trigger: "blur" }
        ],
        so2Level: [
          { required: true, message: "空气二氧化硫指数级别不能为空", trigger: "blur" }
        ],
        coValue: [
          { required: true, message: "空气一氧化碳浓度值不能为空", trigger: "blur" }
        ],
        coLevel: [
          { required: true, message: "空气一氧化碳指数级别不能为空", trigger: "blur" }
        ],
        spmValue: [
          { required: true, message: "空气悬浮颗粒物浓度值不能为空", trigger: "blur" }
        ],
        spmLevel: [
          { required: true, message: "空气PM2.5指数级别不能为空", trigger: "blur" }
        ],
        aqiId: [
          { required: true, message: "空气质量指数级别不能为空", trigger: "blur" }
        ],
        confirmDate: [
          { required: true, message: "确认日期不能为空", trigger: "blur" }
        ],
        confirmTime: [
          { required: true, message: "确认时间不能为空", trigger: "blur" }
        ],
        gmId: [
          { required: true, message: "所属网格员编号不能为空", trigger: "blur" }
        ],
        fdId: [
          { required: true, message: "反馈者编号不能为空", trigger: "blur" }
        ],
        information: [
          { required: true, message: "反馈信息描述不能为空", trigger: "blur" }
        ],
      }
    }
  },
  created() {
    this.getList()
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true
      listStatistics(this.queryParams).then(response => {
        this.statisticsList = response.rows
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
        provinceId: null,
        cityId: null,
        address: null,
        so2Value: null,
        so2Level: null,
        coValue: null,
        coLevel: null,
        spmValue: null,
        spmLevel: null,
        aqiId: null,
        confirmDate: null,
        confirmTime: null,
        gmId: null,
        fdId: null,
        information: null,
        remarks: null
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
      this.title = "添加【请填写功能名称】"
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset()
      const id = row.id || this.ids
      getStatistics(id).then(response => {
        this.form = response.data
        this.open = true
        this.title = "修改【请填写功能名称】"
      })
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateStatistics(this.form).then(response => {
              this.$modal.msgSuccess("修改成功")
              this.open = false
              this.getList()
            })
          } else {
            addStatistics(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除【请填写功能名称】编号为"' + ids + '"的数据项？').then(function() {
        return delStatistics(ids)
      }).then(() => {
        this.getList()
        this.$modal.msgSuccess("删除成功")
      }).catch(() => {})
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/statistics/export', {
        ...this.queryParams
      }, `statistics_${new Date().getTime()}.xlsx`)
    }
  }
}
</script>
