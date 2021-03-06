package xjsnark.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class VerifyEqStatement_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_amfbgx_a(editorContext, node);
  }
  private EditorCell createCollection_amfbgx_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_amfbgx_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_amfbgx_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_amfbgx_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_amfbgx_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_amfbgx_d0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_amfbgx_e0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_amfbgx_f0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_amfbgx_g0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_amfbgx_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "verifyEq");
    editorCell.setCellId("Constant_amfbgx_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_amfbgx_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_amfbgx_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_amfbgx_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new VerifyEqStatement_Editor.exp1SingleRoleHandler_amfbgx_c0(node, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x73bec06cafa7537cL, 0x73bec06cafa7537dL, "exp1"), editorContext);
    return provider.createCell();
  }
  private class exp1SingleRoleHandler_amfbgx_c0 extends SingleRoleCellProvider {
    public exp1SingleRoleHandler_amfbgx_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("exp1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_exp1");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no exp1>";
    }
  }
  private EditorCell createConstant_amfbgx_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ",");
    editorCell.setCellId("Constant_amfbgx_d0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_amfbgx_e0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new VerifyEqStatement_Editor.exp2SingleRoleHandler_amfbgx_e0(node, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x73bec06cafa7537cL, 0x73bec06cafa7537eL, "exp2"), editorContext);
    return provider.createCell();
  }
  private class exp2SingleRoleHandler_amfbgx_e0 extends SingleRoleCellProvider {
    public exp2SingleRoleHandler_amfbgx_e0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("exp2");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_exp2");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no exp2>";
    }
  }
  private EditorCell createConstant_amfbgx_f0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_amfbgx_f0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_amfbgx_g0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ";");
    editorCell.setCellId("Constant_amfbgx_g0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.apply_Semicolon(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
